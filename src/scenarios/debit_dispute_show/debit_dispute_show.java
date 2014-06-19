package debit_dispute_show;

import com.balancedpayments.*;
import com.balancedpayments.errors.*;
import java.util.HashMap;
import java.util.Map;

public class debit_dispute_show {

public static void main(String[] args) throws HTTPError, NoResultsFound, MultipleResultsFound {
Balanced.configure("ak-test-aUV295IugdhWSNx2JFckYBCSvfY2ibgq");

Debit debit = new Debit("/debits/WDJ66VlXnDyDx5AS5uplxyt");
Dispute dispute = debit.dispute;

}
}

