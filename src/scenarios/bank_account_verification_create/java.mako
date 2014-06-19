% if mode == 'definition':
BankAccount().verify()

% else:
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

BankAccount bankAccount = new BankAccount("/bank_accounts/BA7lb2roygfhwDfbvikDLcHP");
try {
    bankAccount.verify();
}
catch (HTTPError e) {}

% endif

