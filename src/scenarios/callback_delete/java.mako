% if mode == 'definition':
Callback().delete()

% else:
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

Callback callback = new Callback("/callbacks/CB7DP9sW9wRe19dFRutynahb");

try {
    callback.delete();
}
catch (APIError e) {}
catch (NotCreated e) {}

% endif

