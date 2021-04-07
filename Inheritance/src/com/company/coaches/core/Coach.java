package com.company.coaches.core;

public interface Coach {
    default void warmup() {
        System.out.println("Default warmup");
    }

    default void training() {
        System.out.println("Default training");
    }

    default void recovery() {
        System.out.println("Default recovery");
    }
}
