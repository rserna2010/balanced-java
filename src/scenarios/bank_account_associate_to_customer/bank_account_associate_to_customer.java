package bank_account_associate_to_customer;

import com.balancedpayments.*;
import com.balancedpayments.errors.*;
import java.util.HashMap;
import java.util.Map;

public class bank_account_associate_to_customer {

public static void main(String[] args) throws HTTPError, NoResultsFound, MultipleResultsFound {
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

Customer customer = new Customer("/customers/CU7yCmXG2RxyyIkcHG3SIMUF");
BankAccount bankAccount = new BankAccount("/bank_accounts/BA7zu6QXmylsn0o6qVpS8UO9");

bankAccount.associateToCustomer(customer);

}
}

