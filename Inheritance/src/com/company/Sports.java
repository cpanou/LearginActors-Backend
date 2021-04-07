package com.company;

import com.company.coaches.core.Coach;
import com.company.coaches.model.CoachAcademy;
import com.company.coaches.core.Sport;

import java.util.ArrayList;
import java.util.List;

public class Sports {

    public static void main(String[] args) {
        // write your code here
        List<Coach> shapeList = new ArrayList<>();
        shapeList.add(CoachAcademy.getCoach(Sport.BASKETBALL));
        shapeList.add(CoachAcademy.getCoach(Sport.FOOTBALL));
        shapeList.add(CoachAcademy.getCoach(Sport.TENNIS));
        shapeList.add(CoachAcademy.getCoach(Sport.CROSSFIT));
        shapeList.forEach(coach -> {
            coach.warmup();
            coach.training();
            coach.recovery();
        });
    }

}
