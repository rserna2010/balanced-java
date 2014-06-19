package bank_account_verification_update;

import com.balancedpayments.*;
import com.balancedpayments.errors.*;
import java.util.HashMap;
import java.util.Map;

public class bank_account_verification_update {

public static void main(String[] args) throws HTTPError, NoResultsFound, MultipleResultsFound {
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

BankAccountVerification verification = new BankAccountVerification("/verifications/BZ7n38gpwYou03mkP4Vt83Cl");
try {
    verification.confirm(1, 1);
}
catch (HTTPError e) {}

}
}

