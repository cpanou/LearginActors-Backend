package com.company.coaches.model;

import com.company.coaches.core.Coach;
import com.company.coaches.core.Sport;

public class CoachAcademy {

    public static Coach getCoach(Sport sport) {
        switch (sport) {
            case TENNIS:
                return new TennisCoach();
            case FOOTBALL:
                return new FootballCoach();
            case BASKETBALL:
                return new BasketballCoach();
            case CROSSFIT:
                return new CrossfitCoach();
            default:
                return new Coach() { };
        }
    }
}
