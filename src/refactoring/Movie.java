package refactoring;

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
        int frequentRenterPoints = 1;
        // add bonus for a two day new release rental
        if ((price.getPriceCode() == NEW_RELEASE) && daysRented > 1)
            frequentRenterPoints++;
        return frequentRenterPoints;
    }

    private abstract class Price {

        public abstract int getPriceCode() ;

        protected abstract double getCharge(int daysRented) ;
    }

    public class ChildrenPrice extends Price {
        @Override
        public int getPriceCode() {
            return Movie.CHILDRENS;
        }
        protected double getCharge(int daysRented) {
            double result = 1.5;
            if (daysRented > 3)
                result += (daysRented - 3) * 1.5;
            return result;
        }
    }
    public class NewReleasePrice extends Price {
        @Override
        public int getPriceCode() {
            return Movie.NEW_RELEASE;
        }
        protected double getCharge(int daysRented) {
            return daysRented * 3;
        }
    }
    public class RegularPrice extends Price {
        @Override
        public int getPriceCode() {
            return Movie.REGULAR;
        }
        protected double getCharge(int daysRented) {
            double result = 2;
            if (daysRented > 2)
                result += (daysRented - 2) * 1.5;

            return result;
        }
    }

}
