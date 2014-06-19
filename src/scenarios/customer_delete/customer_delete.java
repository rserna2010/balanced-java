package customer_delete;

import com.balancedpayments.*;
import com.balancedpayments.errors.*;
import java.util.HashMap;
import java.util.Map;

public class customer_delete {

public static void main(String[] args) throws HTTPError, NoResultsFound, MultipleResultsFound {
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

Customer customer = new Customer("/customers/CUxN95d3eKLokMS6CymVtIB");

try {
    customer.unstore();
}
catch (HTTPError e) {}
catch (NotCreated e) {}

}
}

