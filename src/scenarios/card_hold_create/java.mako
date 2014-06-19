% if mode == 'definition':
CardHold(Map<String, Object> payload)

% else:
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

Card card = new Card("/cards/CC7JlMyXyZ8W3RBfE1SSlnrD");

Map<String, Object> payload = new HashMap<String, Object>();
payload.put("amount", 5000);
payload.put("description", "Some descriptive text for the debit in the dashboard");

try {
    CardHold cardHold = card.hold(payload);
}
catch (HTTPError e) {}

% endif

