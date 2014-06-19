% if mode == 'definition':
Order().save()

% else:
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

Order order = new Order("/orders/OR1oqq5PzdHGkB0GBJJiagNT");

Map<String, String> meta = new HashMap<String, String>();
meta.put("product.id", "1234567890");
meta.put("anykey", "valuegoeshere");

order.meta = meta;
order.description = "New description for order";

try {
    order.save();
}
catch (HTTPError e) {}

% endif

