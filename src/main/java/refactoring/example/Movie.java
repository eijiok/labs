package refactoring.example;

import refactoring.example.price.ChildrenPrice;
import refactoring.example.price.NewReleasePrice;
import refactoring.example.price.Price;
import refactoring.example.price.RegularPrice;

public class Movie {
    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private Price price;
    private String _title;

    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }
    public int getPriceCode() {
        return price.getPriceCode();
    }
    public void setPriceCode(int princeCode) {
        if (princeCode == REGULAR) {
            price = new RegularPrice();
        } else if (princeCode == NEW_RELEASE) {
            price = new NewReleasePrice();
        } else if (princeCode == CHILDRENS) {
            price = new ChildrenPrice();
        } else {
            throw new IllegalArgumentException("Incorrect Price Code");
        }
    }
    public String getTitle (){
        return _title;
    };

    double getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }

    int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }

}
