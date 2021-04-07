package com.company.coaches.model;

import com.company.coaches.core.Coach;

public class TennisCoach implements Coach {
    protected TennisCoach() {
    }

    @Override
    public void warmup() {
        System.out.println(this.getClass().getSimpleName()+ " warmup: throw the ball for the ball boy");
    }

    @Override
    public void training() {
        System.out.println(this.getClass().getSimpleName()+ " training: serve");
    }

    @Override
    public void recovery() {
        System.out.println(this.getClass().getSimpleName()+ " recovery: Cookies and tea");
    }
}
