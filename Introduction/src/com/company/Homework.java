package com.company;

import com.company.homework.ExerciseFirst;

import java.util.ArrayList;
import java.util.List;

import static com.company.Main.readInteger;

public class Homework extends Application {

    private static final List<Runnable> projects = new ArrayList<>();

    static {
        projects.add(new ExerciseFirst(readInteger("Enter n: ")));
    }

    private Homework() {
        super(projects);
    }

    public static void run() {
        System.out.println("------------ Running HomeWork ------------");

        new Homework().start();

        System.out.println("------------ HomeWork Finished ------------");
    }

}
