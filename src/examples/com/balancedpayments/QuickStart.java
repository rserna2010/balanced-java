package com.balancedpayments;

import com.balancedpayments.errors.*;

import java.util.HashMap;
import java.util.Map;

public class QuickStart {

    public static void main(String [] args) throws HTTPError, NoResultsFound, MultipleResultsFound, NotCreated {
        ApiKey key = new ApiKey();
        key.save();
        System.out.printf("Our secret is %s\n", key.secret);

        System.out.printf("Configure with our secret\n");
        Balanced.configure(key.secret);

        System.out.printf("Create marketplace\n");
        Marketplace mp = new Marketplace();
        mp.save();

        System.out.printf("Whats my marketplace? Easy Marketplace.mine().href -> %s\n", Marketplace.mine().href);

        System.out.printf("My marketplace's name is: %s\n", mp.name);
        System.out.printf("Changing it to TestFooey.\n");
        mp.name = "TestFooey";
        mp.save();
        System.out.printf("My marketplace's name is now: %s\n", mp.name);

        System.out.printf("Cool, let's create (tokenize) a card!\n");

        Map<String, Object> cardPayload = new HashMap<String, Object>();
        cardPayload.put("name", "John Jameson");
        cardPayload.put("number", "5105105105105100");
        cardPayload.put("expiration_month", 12);
        cardPayload.put("expiration_year", 2020);
        cardPayload.put("cvv", "123");

        Card buyerCard = new Card(cardPayload);
        buyerCard.save();
        System.out.printf("BOOM");



    }
}
