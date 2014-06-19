% if mode == 'definition':
Refund().save()

% else:
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

Refund refund = new Refund("/refunds/RFFFulVVpBiNWpJ2VLMto1L");

Map<String, String> meta = new HashMap<String, String>();
meta.put("refund.reason", "user not happy with product");
meta.put("user.notes", "very polite on the phone");
meta.put("user.refund.count", "3");
refund.meta = meta;
refund.description = "update this description";

try {
    refund.save();
}
catch (HTTPError e) {}


% endif

