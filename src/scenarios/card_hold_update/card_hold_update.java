package card_hold_update;

import com.balancedpayments.*;
import com.balancedpayments.errors.*;
import java.util.HashMap;
import java.util.Map;

public class card_hold_update {

public static void main(String[] args) throws HTTPError, NoResultsFound, MultipleResultsFound {
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

CardHold cardHold = new CardHold("/card_holds/HL7K6mNHtWSl33Whc0WDOJ81");
cardHold.description = "update this description";
try {
    cardHold.save();
}
catch (HTTPError e) {}

}
}

