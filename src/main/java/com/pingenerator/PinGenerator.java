package com.pingenerator;

import java.io.Serializable;

public class PinGenerator implements Serializable, Cloneable {

    private static PinGenerator pinGenerator;

    private PinGenerator() {
    }

    public static synchronized PinGenerator getInstance() {
        if (pinGenerator == null) {
            pinGenerator = new PinGenerator();
        }
        return pinGenerator;
    }
}
