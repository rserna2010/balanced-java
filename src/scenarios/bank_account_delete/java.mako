% if mode == 'definition':
BankAccount().unstore()

% else:
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

BankAccount bankAccount = new BankAccount("/bank_accounts/BA7sojXcP7oSdQyrjUA7wXg9");
try {
    bankAccount.unstore();
}
catch (APIError e) {}
catch (NotCreated e) {}

% endif

