package com.wandisco;

import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class LockStats implements Stats {
    private long value;
    private transient ReadWriteLock readWriteLock = new ReentrantReadWriteLock();

    public LockStats(long value) {
        this.value = value;
    }

    @Override
    public long getValue() {
        return value;
    }

    @Override
    public Stats add() {
        readWriteLock.writeLock().lock();
        try {
            value++;
        } finally {
          readWriteLock.writeLock().unlock();
        }
        return this;
    }
}
