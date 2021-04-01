package com.company;

import com.company.handson.books.BooksApp;
import com.company.handson.swap.SwapApp;
import com.company.homework.ExerciseFirst;

import java.util.ArrayList;
import java.util.List;

import static com.company.Main.readInteger;

public abstract class Application {
    private final List<Runnable> projects;

    protected Application(List<Runnable> projects) {
        this.projects = projects;
    }

    protected void start() {
        this.projects.forEach(Runnable::run);
    }


    public static class Homework extends Application {

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


    public static class HandsOn extends Application {
        private static final List<Runnable> projects = new ArrayList<>();

        static {
            projects.add(new BooksApp());
            projects.add(new SwapApp());
        }

        private HandsOn() {
            super(projects);
        }

        public static void run() {

            System.out.println("------------ Running Hands On ------------");
            new HandsOn().start();
            System.out.println("------------ Hands On Finished ------------");
        }

    }

}
