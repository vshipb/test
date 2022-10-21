package com.wandisco;

public class StatsTest {
    public static void main(String[] args) {
        for (int i = 0; i < 10; i++) {
            testStats(new ImmutableStats(0));
            testStats(new AtomicStats(0));
            testStats(new SimpleStats(0));
            testStats(new LockStats(0));
        }
    }

    static void testStats(Stats stats) {
        long start = System.currentTimeMillis();
        Stats current = stats;
        for (int i = Integer.MIN_VALUE; i < Integer.MAX_VALUE; i++) {
            current = current.add();
        }
        long end = System.currentTimeMillis();
        System.out.println(current.getClass().getSimpleName() + " : " + current.getValue() + " : " + (end - start));
    }
}
