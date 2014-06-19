% if mode == 'definition':
CardHold().unstore()

% else:
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

CardHold cardHold = new CardHold("/card_holds/HL4F8FdmMdyVxzE515FygGd");
try {
    cardHold.unstore();
}
catch (HTTPError e) {}
catch (NotCreated notCreated) {}

% endif

