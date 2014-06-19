% if mode == 'definition':
BankAccount().associateToCustomer(Customer customer)

% else:
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

Customer customer = new Customer("/customers/CU7yCmXG2RxyyIkcHG3SIMUF");
BankAccount bankAccount = new BankAccount("/bank_accounts/BA7zu6QXmylsn0o6qVpS8UO9");

bankAccount.associateToCustomer(customer);

% endif

