% if mode == 'definition':
CardHold().capture(Map<String, Object> payload)

% else:
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

CardHold cardHold = new CardHold("/card_holds/HL7K6mNHtWSl33Whc0WDOJ81");

Map<String, Object> payload = new HashMap<String, Object>();
payload.put("amount", 1000);
payload.put("description", "Some descriptive text for the debit in the dashboard");
payload.put("appears_on_statement_as", "ShowsUpOnStmt");

try {
    cardHold.capture(payload);
}
catch (HTTPError e) {}

% endif

