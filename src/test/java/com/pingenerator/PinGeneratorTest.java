package com.pingenerator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class PinGeneratorTest {

    @DisplayName("Test if the clone method calls then throws CloneNotSupportedException")
    @Test
    void testCloneThrowsException() {
        PinGenerator pinGenerator = PinGenerator.getInstance();
        assertThrows(CloneNotSupportedException.class, () -> {
            pinGenerator.clone();
        });
    }

    @DisplayName("Test the get instance provide the correct instance")
    @Test
    void testGetInstanceProvidePinGenerator() {
        assertEquals(PinGenerator.getInstance().getClass(), PinGenerator.class);
    }

}