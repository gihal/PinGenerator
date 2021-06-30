package com.pingenerator;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Set;

import static org.junit.jupiter.api.Assertions.*;

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


    @DisplayName("Test the size of the set is equal to 1000")
    @Test
    void testThePinSetSize() {
        PinGenerator instance = PinGenerator.getInstance();
        Set<Integer> pins = instance.getPins();
        assertEquals(1000, pins.size());
    }

    @DisplayName("Test the pins are four digits numbers")
    @Test
    void testThePinSize() {
        PinGenerator instance = PinGenerator.getInstance();
        Set<Integer> pins = instance.getPins();
        for (Integer pin : pins) {
            assertTrue(pin > 999 && pin < 10000);
        }
    }

}