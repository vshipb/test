package com.wandisco;

public class ImmutableStats implements Stats {
    private final long value;

    public ImmutableStats(long value) {
        this.value = value;
    }

    public long getValue() {
        return value;
    }

    public ImmutableStats add() {
        return new ImmutableStats(value + 1);
    }

}
