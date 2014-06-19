% if mode == 'definition':
Customer().unstore()

% else:
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

Customer customer = new Customer("/customers/CUxN95d3eKLokMS6CymVtIB");

try {
    customer.unstore();
}
catch (HTTPError e) {}
catch (NotCreated e) {}

% endif

