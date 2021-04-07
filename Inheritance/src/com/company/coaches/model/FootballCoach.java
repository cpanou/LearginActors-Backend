package com.company.coaches.model;

import com.company.coaches.core.Coach;

public class FootballCoach implements Coach {
    protected FootballCoach() {
    }

    @Override
    public void warmup() {
        System.out.println(this.getClass().getSimpleName()+ " warmup: Jumping Jacks");
    }

    @Override
    public void training() {
        System.out.println(this.getClass().getSimpleName()+ " training: Passing");
    }

    @Override
    public void recovery() {
        System.out.println(this.getClass().getSimpleName()+ " recovery Massage");
    }
}
