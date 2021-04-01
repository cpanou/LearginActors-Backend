package com.company.handson.books;

public class Customer {
    private String name;
    private double cash;

    public Customer(String name, Integer cash) {
        this.name = name;
        this.cash = cash;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCash() {
        return cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public void purchaseBook(Book book) {
        if (this.cash >= book.getPrice()) {
            this.cash -= book.getPrice();
            System.out.println(this.name + " purchased " + book.getTitle() + ", remaining cash:" + this.cash);
        } else {
            System.out.println(this.name + " does not have enough cash to purchase " + book.getTitle());
        }
    }
}
