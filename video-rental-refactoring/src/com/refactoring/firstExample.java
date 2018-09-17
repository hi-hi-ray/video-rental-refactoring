package com.refactoring;

public class firstExample {

    public static void main(String[] args) {
        Customer customerRegular = new Customer("Sabrina");
        Customer customerKid = new Customer("Rachel");
        Customer customerNewRelease = new Customer("Joey");

        Movie kidMovie = new Movie("Moana", Movie.CHILDRENS);
        Movie actionMovie = new Movie("Cock Puncher", Movie.REGULAR);
        Movie newMovie = new Movie("Bridget Jones's Diary", Movie.NEW_RELEASE);

        customerNewRelease.addRental(new Rental(newMovie, 4));
        customerKid.addRental(new Rental(kidMovie, 3));
        customerRegular.addRental(new Rental(actionMovie, 2));

        System.out.println(customerRegular.htmlStatement());
        System.out.println("~-*-*-*-*-~");
        System.out.println(customerKid.htmlStatement());
        System.out.println("~-*-*-*-*-~");
        System.out.println(customerNewRelease.htmlStatement());
    }

}
