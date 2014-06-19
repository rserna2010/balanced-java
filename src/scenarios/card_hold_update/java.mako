% if mode == 'definition':
CardHold().save()

% else:
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

CardHold cardHold = new CardHold("/card_holds/HL7K6mNHtWSl33Whc0WDOJ81");
cardHold.description = "update this description";
try {
    cardHold.save();
}
catch (HTTPError e) {}

% endif

