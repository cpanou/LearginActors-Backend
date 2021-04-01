package com.company;


import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

    private static final BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

    public static int readInteger(String message) {
        try {
            System.out.println(message);
            return Integer.parseInt(reader.readLine());
        } catch (Exception e) {
            System.out.println("wrong input...try again");
            return readInteger(message);
        }
    }

    public static void main(String[] args) {
        Application.Homework.run();
        Application.HandsOn.run();
    }

}
