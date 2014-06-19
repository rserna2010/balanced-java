package com.balancedpayments.core;

import com.balancedpayments.Balanced;
import com.balancedpayments.errors.HTTPError;
import org.apache.http.NameValuePair;
import org.apache.http.client.utils.URIBuilder;
import org.apache.http.client.utils.URLEncodedUtils;

import java.net.URISyntaxException;
import java.util.*;

public class ResourcePagination<T> implements Iterable<T> {
    
    public class ResourceIterator implements Iterator<T> {
        
        public String href;
        public ResourcePage<T> page;
        public Integer index;
        
        public ResourceIterator(String href, ResourcePage<T> page) {
            this.href = href;
            this.page = page;
            this.index = 0;
        }
        
        public boolean hasNext() {
            try {
                return (index < page.getSize() || this.page.getNextUri() != null);
            }
            catch (HTTPError e) {
                throw new RuntimeException(e);
            }
        }

        public T next() {
            if (!hasNext())
                throw new NoSuchElementException();
            try {
                if (index >= page.getSize()) {
                    page = page.getNext();
                    index = 0; 
                }
                T t = page.getItems().get(index);
                index += 1;
                return t;
            }
            catch (HTTPError e) {
                throw new RuntimeException(e);
            }
        }

        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
    
    protected Client client = Balanced.getInstance().getClient();
    protected Class<T> cls;
    protected URIBuilder uri_builder; 

    public ResourcePagination(Class<T> cls, String href) {
        this.cls = cls; 
        try {
            this.uri_builder = new URIBuilder(href);
        }
        catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
    
    public T create() throws HTTPError {
        Map<String, Object> payload = new HashMap<String, Object>();
        return create(payload);
    }
    
    public T create(Map<String, Object> payload) throws HTTPError {
        T t;
        try {
            t = cls.newInstance();
        }
        catch (InstantiationException e) {
            throw new RuntimeException(e);
        }
        catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        }
        ((Resource) t).deserialize(client.post(getURI(), payload));
        return t;
    }
    
    public int total() throws HTTPError {
        Integer limit = getLimit();
        setLimit(1);
        String href = getURI();
        ResourcePage<T> page = new ResourcePage<T>(cls, href);
        setLimit(limit);
        return page.getTotal();
    }
    
    protected Integer getLimit() {
        for (NameValuePair kv: uri_builder.getQueryParams()) {
            if (kv.getName().equals("limit")) {
                return new Integer(kv.getValue());
            }
        }
        return null;
    }
    
    protected void setLimit(Integer limit) {
        if (limit == null) {
            List<NameValuePair> params = uri_builder.getQueryParams();
            NameValuePair current = null;
            Iterator<NameValuePair> iter = params.iterator();
            while (iter.hasNext()) {
                current = iter.next();
                if (current.getName().equals("limit")) {
                    iter.remove();
                    String qs = URLEncodedUtils.format(params, "UTF-8");
                    uri_builder.setQuery(qs);
                    break;
                }
            }
        }
        else
            uri_builder.setParameter("limit", limit.toString());
    }
    
    protected String getURI() {
        try {
            return uri_builder.build().toString();
        }
        catch (URISyntaxException e) {
            throw new RuntimeException(e);
        }
    }
    
    public Iterator<T> iterator() {
        String href = getURI();
        ResourcePage<T> page = new ResourcePage<T>(cls, href);
        return new ResourceIterator(href, page);
    }
    
    public ArrayList<T> all() throws HTTPError {
        String href = getURI();
        ResourcePage<T> page = new ResourcePage<T>(cls, href);
        ArrayList<T> items = new ArrayList<T>(page.getTotal());
        Iterator<T> iterator = new ResourceIterator(href, page);
        while (iterator.hasNext()) {
            T obj = iterator.next();
            items.add(obj);
        }
        return items;
    }
}
