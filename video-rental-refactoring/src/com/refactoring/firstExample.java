package com.refactoring;

public class firstexample {
    public static void main(String[] args) {
        Customer customer = new Customer("Sabrina");
        Customer customer_kid = new Customer("Rachel");
        Customer customer_new = new Customer("Joey");

        Movie kidMovie = new Movie("Moana", Movie.CHILDRENS);
        Movie actionMovie = new Movie("CockPunch", Movie.REGULAR);
        Movie newMovie = new Movie("Bridget Jones's Diary", Movie.NEW_RELEASE);
        
        customer_new.addRental(new Rental(newMovie, 4));
        customer_kid.addRental(new Rental(kidMovie, 3));
        customer.addRental(new Rental(actionMovie, 2));
        
        System.out.println(customer.statement());
        System.out.println("~-*-*-*-*-~");
        System.out.println(customer_kid.statement());
        System.out.println("~-*-*-*-*-~");
        System.out.println(customer_new.statement());
    }
    
}
