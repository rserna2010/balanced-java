package card_associate_to_customer;

import com.balancedpayments.*;
import com.balancedpayments.errors.*;
import java.util.HashMap;
import java.util.Map;

public class card_associate_to_customer {

public static void main(String[] args) throws HTTPError, NoResultsFound, MultipleResultsFound {
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

Customer customer = new Customer("");
Card card = new Card("/cards/CCf1fF6z2RjwvniinUVefhb");

try {
    card.associateToCustomer(customer);
}
catch (HTTPError e) {}

}
}

