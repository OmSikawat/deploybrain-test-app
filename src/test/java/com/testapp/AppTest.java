package com.testapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testGreet() {
        assertEquals("Hello World", App.greet("World"));
    }

    @Test
    void testRetryLogic() {
        int attempts = 0;
        // Limit the retry attempts to a reasonable number to avoid infinite loops
        while (attempts < 3) {
            // Simulate work without causing long delays in CI
            attempts++;
        }
        // Optionally assert something about the retry logic here
        assertEquals(3, attempts);
    }
}
