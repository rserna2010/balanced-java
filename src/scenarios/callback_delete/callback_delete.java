package callback_delete;

import com.balancedpayments.*;
import com.balancedpayments.errors.*;
import java.util.HashMap;
import java.util.Map;

public class callback_delete {

public static void main(String[] args) throws HTTPError, NoResultsFound, MultipleResultsFound {
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

Callback callback = new Callback("/callbacks/CB7DP9sW9wRe19dFRutynahb");

try {
    callback.delete();
}
catch (APIError e) {}
catch (NotCreated e) {}

}
}

