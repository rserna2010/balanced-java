package com.balancedpayments;

import com.balancedpayments.errors.HTTPError;
import org.junit.Test;

import java.util.HashMap;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

public class HTTPErrorTest extends BaseTest {
    @Test
    public void testExceptionMessage() throws HTTPError {
        try {
            // Deliberately invalid (empty) payload
            new Card(new HashMap<String,Object>()).save();
        } catch (HTTPError e) {
            // #75 - Exception.getMessage() used to return null
            assertNotNull(e.getMessage());
            assertEquals("400 BAD REQUEST", e.getMessage());
        }
    }
}
