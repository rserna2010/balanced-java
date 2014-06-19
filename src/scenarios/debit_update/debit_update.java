package debit_update;

import com.balancedpayments.*;
import com.balancedpayments.errors.*;
import java.util.HashMap;
import java.util.Map;

public class debit_update {

public static void main(String[] args) throws HTTPError, NoResultsFound, MultipleResultsFound {
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

Debit debit = new Debit("/debits/WDh5j4t3Rkh7oeONR9Izy61");
debit.description = "New description for debit";

Map<String, String> meta = new HashMap<String, String>();
meta.put("anykey", "valuegoeshere");
meta.put("facebook.id", "1234567890");

debit.meta = meta;

try {
    debit.save();
}
catch (HTTPError e) {}

}
}

