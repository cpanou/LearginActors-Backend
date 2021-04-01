package com.company.handson.swap;

public class TestSwap {

    public void swap(Person person1, Person person2) {
        int age1 = person1.getAge();
        person1.setAge(person2.getAge());
        person2.setAge(age1);
    }

}
