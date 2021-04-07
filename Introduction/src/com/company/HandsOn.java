package com.company;

import com.company.handson.books.BooksApp;
import com.company.handson.swap.SwapApp;

import java.util.ArrayList;
import java.util.List;

public class HandsOn extends Application {
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
