package com.testapp;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    @Test
    void testGreet() {
        assertEquals("Hello World", App.greet("World"));
    }

    @Test
void testLargeDataProcessing() {
    java.util.List<int[]> data = new java.util.ArrayList<>();
    for (int i = 0; i < 1_000_000; i++) {
        data.add(new int[10_000]);
    }
    assertNotNull(data);
}
}