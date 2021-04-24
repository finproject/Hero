package com.naya.hero.fabric;

import java.util.Random;

public class Generator {

    public static int generatorNumbers(RangeParameters range) {
        return range.getMin() + new Random().nextInt(range.getMax() -range.getMin());
    }

    public static String generatorName() {
        return new Random()
                .ints(97, 122 + 1)
                .limit(4)
                .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
                .toString();
    }
}
