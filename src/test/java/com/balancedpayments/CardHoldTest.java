package com.balancedpayments;

import com.balancedpayments.errors.*;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class CardHoldTest extends BaseTest {

    @Test
    public void testCardHoldCreate() throws HTTPError {
        Card card = createCard();

        Map<String, Object> payload = new HashMap<String, Object>();
        payload.put("amount", 2000);

        CardHold cardHold = card.hold(payload);
        cardHold.save();

        assertEquals(2000, cardHold.amount.intValue());
    }

    @Test
    public void testCardHoldCapturePartial() throws HTTPError {
        Card card = createCard();

        Map<String, Object> payload = new HashMap<String, Object>();
        payload.put("amount", 2000);

        CardHold cardHold = card.hold(payload);

        Map<String, Object> capturePayload = new HashMap<String, Object>();
        capturePayload.put("amount", 1000);

        Debit debit = cardHold.capture(capturePayload);
        assertEquals(2000, cardHold.amount.intValue());
        assertEquals(1000, debit.amount.intValue());
        assertEquals(card.href, debit.source.href);
    }

    @Test
    public void testCardHoldCapture() throws HTTPError {
        Card card = createCard();

        Map<String, Object> payload = new HashMap<String, Object>();
        payload.put("amount", 2000);

        CardHold cardHold = card.hold(payload);

        Debit debit = cardHold.capture();
        assertEquals(2000, debit.amount.intValue());
        assertEquals(card.href, debit.source.href);
    }

    @Test
    public void testCardHoldVoid() throws HTTPError, NotCreated {
        Card card = createCard();

        Map<String, Object> payload = new HashMap<String, Object>();
        payload.put("amount", 2000);

        CardHold cardHold = card.hold(payload);

        assertNull(cardHold.voided_at);

        cardHold.unstore();
        cardHold.reload();

        assertNotNull(cardHold.voided_at);
    }
}
