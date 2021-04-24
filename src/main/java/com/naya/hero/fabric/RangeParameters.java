package com.naya.hero.fabric;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RangeParameters {
    private int min;
    private int max;

    public RangeParameters() {
    }

    public RangeParameters(int min, int max) {
        this.min = min;
        this.max = max;
    }
}
