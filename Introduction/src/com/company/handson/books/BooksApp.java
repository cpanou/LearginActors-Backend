package com.company.handson.books;

public class BooksApp implements Runnable {
    @Override
    public void run() {
        Book harryPotter1 = new Book("Harry Potter", "J.J. Abrams(not)", 22.5);
        Book harryPotter2 = new Book("Harry Potter 2", "J.J. Abrams(not)", 28.5);
        Book harryPotter3 = new Book("Harry Potter 3", "J.J. Abrams(not)", 12.5);

        Customer customer = new Customer("Bob", 40);
        customer.purchaseBook(harryPotter1);
        customer.purchaseBook(harryPotter2);
        customer.purchaseBook(harryPotter3);
    }
}
