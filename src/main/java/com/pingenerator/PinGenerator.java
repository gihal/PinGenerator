package com.pingenerator;

import java.io.ObjectStreamException;
import java.io.Serializable;
import java.security.SecureRandom;
import java.util.HashSet;
import java.util.Set;

public class PinGenerator implements Serializable, Cloneable {

    private static PinGenerator pinGenerator;

    private PinGenerator() {
    }

    private Object readResolve() throws ObjectStreamException {
        return pinGenerator;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        throw new CloneNotSupportedException();
    }

    public static synchronized PinGenerator getInstance() {
        if (pinGenerator == null) {
            pinGenerator = new PinGenerator();
        }
        return pinGenerator;
    }

    /**
     * Get a thousand set of four digit positive integers
     *
     * @return Returns a set of integers
     */
    public synchronized Set<Integer> getPins() {
        Set<Integer> pins = new HashSet<Integer>();
        SecureRandom secureRandom = new SecureRandom();
        while (pins.size() < 1000) {
            int pin = secureRandom.nextInt(100000);
            if (pin > 999 && pin < 10000) {
                pins.add(pin);
            }
        }
        return pins;
    }
}
