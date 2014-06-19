package refund_update;

import com.balancedpayments.*;
import com.balancedpayments.errors.*;
import java.util.HashMap;
import java.util.Map;

public class refund_update {

public static void main(String[] args) throws HTTPError, NoResultsFound, MultipleResultsFound {
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

Refund refund = new Refund("/refunds/RFFFulVVpBiNWpJ2VLMto1L");

Map<String, String> meta = new HashMap<String, String>();
meta.put("refund.reason", "user not happy with product");
meta.put("user.notes", "very polite on the phone");
meta.put("user.refund.count", "3");
refund.meta = meta;
refund.description = "update this description";

try {
    refund.save();
}
catch (HTTPError e) {}


}
}

