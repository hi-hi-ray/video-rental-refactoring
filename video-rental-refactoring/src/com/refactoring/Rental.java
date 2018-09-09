package com.refactoring;

public class Rental {
    private Movie _movie;
    private int _daysRented;

    public Rental(Movie movie, int daysRented) {
        _movie = movie;
        _daysRented = daysRented;
    }

    public int getDaysRented() {
        return _daysRented;
    }

    public Movie getMovie() {
        return _movie;
    }
    
    public Double getCharge() {
        double amountResult = 0;
        switch (getMovie().getPriceCode()) {
            case Movie.REGULAR:
                amountResult += 2;
                if (getDaysRented() > 2) {
                    amountResult += (getDaysRented() - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                amountResult += getDaysRented() * 3;
                break;
            case Movie.CHILDRENS:
                amountResult += 1.5;
                if (getDaysRented() > 3) {
                    amountResult += (getDaysRented() - 3) * 1.5;
                }
                break;
        }
        return amountResult;
    }
}
