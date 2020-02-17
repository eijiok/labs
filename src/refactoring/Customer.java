package refactoring;

import java.util.Enumeration;
import java.util.Vector;

public class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer (String name){
        _name = name;
    };

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName (){
        return _name;
    };

    public String statement() {

        int totalFrequentRenterPoints = 0;
        Enumeration rentals = _rentals.elements();

        String result = "Rental Record for " + getName() + "\n";

        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();

            // add frequent renter points
            totalFrequentRenterPoints += each.getFrequentRenterPoints();

            //show figures for this rental
            result += "\t" + each.getMovie().getTitle()+ "\t" +
                    String.valueOf(each.getCharge()) + "\n";
        }

        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(totalFrequentRenterPoints) + " frequent renter points";
        return result;
    }

    private double getTotalCharge() {
        double totalAmount = 0;
        Enumeration rentalsElements = _rentals.elements();
        while (rentalsElements.hasMoreElements()) {
            Rental each = (Rental) rentalsElements.nextElement();
            totalAmount += each.getCharge();
        }
        return totalAmount;
    }

}
