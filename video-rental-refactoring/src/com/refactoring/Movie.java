package com.refactoring;

public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;

    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode); 
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        _priceCode = arg;
    }

    public String getTitle() {
        return _title;
    }

    public Double getCharge(int daysRented) {
        double amountResult = 0;
        switch (getPriceCode()) {
            case Movie.REGULAR:
                amountResult += 2;
                if (daysRented > 2) {
                    amountResult += (daysRented - 2) * 1.5;
                }
                break;
            case Movie.NEW_RELEASE:
                amountResult += daysRented * 3;
                break;
            case Movie.CHILDRENS:
                amountResult += 1.5;
                if (daysRented > 3) {
                    amountResult += (daysRented - 3) * 1.5;
                }
                break;
        }
        return amountResult;
    }

    public int getFrequentRenterPoints(int daysRented) {
        if ((getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1) {
            return 2;
        } else {
            return 1;
        }
    }
}
