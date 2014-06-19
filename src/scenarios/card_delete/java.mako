% if mode == 'definition':
Card().unstore()

% else:
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

Card card = new Card("/cards/CC832pqCbRPor1ewRdxPvnv");
try {
    card.unstore();
}
catch (HTTPError e) {}
catch (NotCreated e) {}

% endif

