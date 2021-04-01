package com.company.homework;

import com.company.Main;

import static com.company.Main.readInteger;

public class ExerciseFirst implements Runnable {
    private final int n;

    public ExerciseFirst(int n) {
        this.n = n;
    }

    @Override
    public void run() {
        this.factorial();
        this.factorSequence();
        this.division(readInteger("Enter a divider for n: "));
        this.leapYear(readInteger("Enter a year:"));
        this.primes();
        this.divisionRepresentation(readInteger("Enter a divisor for n:"));
    }

    public void factorial() {
        long result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("n! = " + result);
    }

    public void factorSequence() {
        double result = 0;
        for (int i = 1; i <= n; i++) {
            result += (double) 1 / i;
        }
        System.out.println("1 + 1/2 + 1/3 +....+ 1/n = " + result);
    }

    public void division(int divider) {
        if (divider == 0) {
            System.out.println("Cannot divide with zero(0)");
        } else {
            System.out.println(n + "/" + divider + "=" + n / divider);
        }
    }

    public void leapYear(int year) {
        boolean isLeap = year % 4 == 0 && year % 100 != 0 || (year % 400 == 0);
        System.out.println(year + " is " + (isLeap ? "" : "NOT ") + "a leap year");
    }

    public void primes() {
        System.out.println(" Prime numbers from 0 to 100:");
        for (int i = 0; i <= 100; i++) {
            if (isPrime(i))
                System.out.print(i + ",");
        }
        System.out.println();
    }

    private boolean isPrime(int n) {
        if (n == (2) || n == (3)) {
            return true;
        } else if (n <= 1 || (n % 2) == (0) || (n % 3) == (0)) {
            return false;
        }
        int i = 5;
        while (Math.pow(i, 2) <= n) {
            if ((n % i) == (0) || (n % (i + 2)) == (0)) {
                return false;
            }
            i += 6;
        }
        return true;
    }

    public void divisionRepresentation(int divisor) {
        int result = n / divisor;
        System.out.println(n + " = " + divisor + "*" + result + " + " + n % divisor);
    }

}
