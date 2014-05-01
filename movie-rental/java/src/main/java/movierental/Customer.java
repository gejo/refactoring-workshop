package movierental;
import java.util.ArrayList;
import java.util.List;

public class Customer {

    private String _name;
    private List<Rental> rentals = new ArrayList<Rental>();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {

        String result = "Rental Record for " + getName() + "\n";

        for (Rental rental: rentals) {
            double rentalAmount = rental.calculateAmount();
            // show figures for this rental
            result += "\t" + rental.getMovie().getTitle() + "\t" + String.valueOf(rentalAmount) + "\n";
        }

        // add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getFrequentRenterPoints()) + " frequent renter points";

        return result;
    }

    private double getTotalCharge() {
        double result = 0;
        for (Rental rental: rentals) {
            // show figures for this rental
            result += rental.calculateAmount();
        }
        return result;
    }

    private int getFrequentRenterPoints() {
        int result = 0;
        for (Rental rental: rentals) {
            // add frequent renter points
            result += rental.getFrequentRenterPoints();
        }
        return result;
    }

}
