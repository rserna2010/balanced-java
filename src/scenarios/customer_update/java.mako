% if mode == 'definition':
Customer().save()

% else:
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

Customer customer = new Customer("/customers/CUrtoxuYO4XmXZi6NzXKBLL");

Map<String, String> meta = new HashMap<String, String>();
meta.put("shipping-preference", "ground");

customer.meta = meta;
customer.email = "email@newdomain.com";

try {
    customer.save();
}
catch (HTTPError e) {}

% endif

