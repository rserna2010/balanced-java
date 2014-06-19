% if mode == 'definition':
Card().associateToCustomer(Customer customer)

% else:
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

Customer customer = new Customer("");
Card card = new Card("/cards/CCf1fF6z2RjwvniinUVefhb");

try {
    card.associateToCustomer(customer);
}
catch (HTTPError e) {}

% endif

