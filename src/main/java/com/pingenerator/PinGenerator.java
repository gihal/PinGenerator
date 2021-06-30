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
}
