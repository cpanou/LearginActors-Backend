package com.company.coaches.model;

import com.company.coaches.core.Coach;

public class CrossfitCoach implements Coach {
    protected CrossfitCoach(){}
    @Override
    public void warmup() {
        System.out.println(this.getClass().getSimpleName()+ " warmup: Dead-lift");
    }

    @Override
    public void training() {
        System.out.println(this.getClass().getSimpleName()+ " training: Dead-lifts");
    }

    @Override
    public void recovery() {
        System.out.println(this.getClass().getSimpleName()+ " recovery: more Dead-lifts");
    }
}
