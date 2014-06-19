% if mode == 'definition':
ApiKey(Map<String, Object> payload)

% else:
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

ApiKey key = new ApiKey();
try {
    key.save();
}
catch (HTTPError e) {}

% endif

