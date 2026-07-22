package com.testapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testGreet() {
        assertEquals("Hello World", App.greet("World"));
    }

    @Test
void testRetryLogic() throws InterruptedException {
    int attempts = 0;
    while (attempts >= 0) {  // bug: condition never becomes false
        Thread.sleep(120000);
        attempts++;
    }
}
}