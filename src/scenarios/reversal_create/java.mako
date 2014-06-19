% if mode == 'definition':
Credit().reverse()

% else:
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

Credit credit = new Credit("/credits/CR1ynmPUlJGbV9EMyqkowHJP");

HashMap<String, Object> meta = new HashMap<String, Object>();
meta.put("user.refund_reason", "not happy with product");
meta.put("merchant.feedback", "positive");
meta.put("fulfillment.item.condition", "OK");

HashMap<String, Object> payload = new HashMap<String, Object>();
payload.put("amount", 3000);
payload.put("description", "Reversal for Order #1111");
payload.put("meta", meta);

try {
    credit.reverse(payload);
}
catch (HTTPError e) {}

% endif

