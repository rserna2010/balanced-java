% if mode == 'definition':
Customer().createOrder(Map<String, Object> payload)

% else:
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

Customer customer = new Customer("/customers/CUxN95d3eKLokMS6CymVtIB");

Map<String, Object> payload = new HashMap<String, Object>();
payload.put("description", "Order #12341234");

try {
    customer.createOrder(payload);
}
catch (HTTPError e) {}

% endif

