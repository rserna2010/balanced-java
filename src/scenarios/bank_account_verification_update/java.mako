% if mode == 'definition':
BankAccountVerification.save()

% else:
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

BankAccountVerification verification = new BankAccountVerification("/verifications/BZ7n38gpwYou03mkP4Vt83Cl");
try {
    verification.confirm(1, 1);
}
catch (HTTPError e) {}

% endif

