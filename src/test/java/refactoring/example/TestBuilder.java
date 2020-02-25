package refactoring.example;

import java.util.ArrayList;
import java.util.List;

public class TestBuilder {
    private Customer customer;
    private String customerName;

    private List<FilmPrice> listFilmPrices;
    private String total;
    private String pointsEarned;

    public TestBuilder() {
    }

    public TestBuilder (String customerName) {
        this.customerName = customerName;
        customer = new Customer(this.customerName);
        listFilmPrices = new ArrayList<>();
    }

    public TestBuilder addFilm(String filmTitle, int priceCode, int daysRented, String filmPrice) {

        Movie movie = new Movie(filmTitle, priceCode);
        Rental rental = new Rental(movie, daysRented);
        listFilmPrices.add(new FilmPrice(filmTitle, filmPrice));
        customer.addRental(rental);
        return this;
    }

    public Customer getCustomer() {
        return customer;
    }

    public String resultFirstLine() {
        return "Rental Record for " + customerName + "\n";
    }

    public String resultFilmsPrice() {
        StringBuilder sb = new StringBuilder();
        for (FilmPrice filmPrice : listFilmPrices) {
            sb.append("\t").append(filmPrice.filmTitle).append("\t").append(filmPrice.filmPrice).append("\n");
        }
        return sb.toString();
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void setPointsEarned(String pointsEarned) {
        this.pointsEarned = pointsEarned;
    }

    public String resultAmountOwed() {
        return "Amount owed is " + total + "\n";
    }

    public String resultPointsEarned() {
        return "You earned " + pointsEarned + " frequent renter points";
    }

    class FilmPrice {
        public final String filmTitle;
        public final String filmPrice;

        public FilmPrice(String title, String price) {
            this.filmTitle = title;
            this.filmPrice = price;
        }
    }
}