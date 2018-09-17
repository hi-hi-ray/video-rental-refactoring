package com.refactoring;

public abstract class Price {
    abstract int getPriceCode(); 
    
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
}

