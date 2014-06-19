% if mode == 'definition':
ApiKey().unstore()

% else:
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

ApiKey key = new ApiKey("/api_keys/AK7gg5FNb0Owb6hErcMm0CZ7");
try {
    key.unstore();
}
catch (APIError e) {}
catch (NotCreated notCreated) {}

% endif

