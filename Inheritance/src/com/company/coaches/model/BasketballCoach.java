package com.company.coaches.model;

import com.company.coaches.core.Coach;

public class BasketballCoach implements Coach {

    protected BasketballCoach(){}

    @Override
    public void warmup() {
        System.out.println(this.getClass().getSimpleName()+ " warmup: Run circles");
    }

    @Override
    public void training() {
        System.out.println(this.getClass().getSimpleName()+ " training: Layups and free-throws");
    }

    @Override
    public void recovery() {
        System.out.println(this.getClass().getSimpleName()+ " recovery: Run circles");
    }
}
