package com.wandisco;

public class SimpleStats implements Stats{
    private long value;

    public SimpleStats(long value) {
        this.value = value;
    }

    @Override
    public long getValue() {
        return value;
    }

    @Override
    public Stats add() {
        value++;
        return this;
    }
}
