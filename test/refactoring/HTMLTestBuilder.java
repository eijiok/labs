package refactoring;

import java.util.ArrayList;
import java.util.List;

public class HTMLTestBuilder {
    private Customer customer;
    private String customerName;

    private List<FilmPrice> listFilmPrices;
    private String total;
    private String pointsEarned;

    public HTMLTestBuilder() {
    }

    public HTMLTestBuilder(String customerName) {
        this.customerName = customerName;
        customer = new Customer(this.customerName);
        listFilmPrices = new ArrayList<>();
    }

    public HTMLTestBuilder addFilm(String filmTitle, int priceCode, int daysRented, String filmPrice) {

        Movie movie = new Movie(filmTitle, priceCode);
        Rental rental = new Rental(movie, daysRented);
        listFilmPrices.add(new FilmPrice(filmTitle, filmPrice));
        customer.addRental(rental);
        return this;
    }

    public Customer getCustomer() {
        return customer;
    }

    /**
     * <H1>Rentals for <EM>Eiji</EM></H1><P>
     * @return
     */
    public String resultFirstLine() {
        return "<H1>Rentals for <EM>"+customerName+"</EM></H1><P>\n";
    }

    /**
      * Back to the Future: 2.0<BR>
     * @return
     */
    public String resultFilmsPrice() {
        StringBuilder sb = new StringBuilder();
        for (FilmPrice filmPrice : listFilmPrices) {
            sb.append(filmPrice.filmTitle).append(": ").append(filmPrice.filmPrice).append("<BR>\n");
        }
        return sb.toString();
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public void setPointsEarned(String pointsEarned) {
        this.pointsEarned = pointsEarned;
    }

    /**
     *      <P>You owe <EM>2.0</EM><P>
     * @return
     */
    public String resultAmountOwed() {
        return "<P>You owe <EM>"+total+"</EM><P>\n";
    }

    /**
     *      On this rental you earned <EM>1</EM> frequent renter points<P>
     * @return
     */
    public String resultPointsEarned() {
        return "On this rental you earned <EM>"+pointsEarned+"</EM> frequent renter points<P>";
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