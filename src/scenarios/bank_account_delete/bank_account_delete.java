package bank_account_delete;

import com.balancedpayments.*;
import com.balancedpayments.errors.*;
import java.util.HashMap;
import java.util.Map;

public class bank_account_delete {

public static void main(String[] args) throws HTTPError, NoResultsFound, MultipleResultsFound {
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

BankAccount bankAccount = new BankAccount("/bank_accounts/BA7sojXcP7oSdQyrjUA7wXg9");
try {
    bankAccount.unstore();
}
catch (APIError e) {}
catch (NotCreated e) {}

}
}

