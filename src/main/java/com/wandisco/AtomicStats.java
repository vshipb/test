package com.wandisco;

import java.util.concurrent.atomic.AtomicLong;

public class AtomicStats implements Stats {
    private final AtomicLong value;

    public AtomicStats(long value) {
        this.value = new AtomicLong(value);
    }

    public long getValue() {
        return value.get();
    }

    public AtomicStats add() {
        value.incrementAndGet();
        return this;
    }

}

