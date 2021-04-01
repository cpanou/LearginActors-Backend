package com.company.handson.swap;

public class SwapApp implements Runnable {

    @Override
    public void run() {
        Person john = new Person("John", 23);
        Person michael = new Person("Michael", 45);
        System.out.println(john.toString() + " :: " + michael.toString());

        TestSwap swapper = new TestSwap();
        swapper.swap(john, michael);

        System.out.println(john.toString() + " :: " + michael.toString());
    }
}
