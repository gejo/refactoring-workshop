package movierental;

/**
 * The rental class represents a customer renting a movie.
 */
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

    double calculateAmount() {
        return getMovie().getCharge(getDaysRented());
    }

    int getFrequentRenterPoints() {
        // add bonus for a two day new release rental
        return ((getMovie().getPriceCode() == PriceFactory.NEW_RELEASE) && getDaysRented() > 1) ? 2 : 1;
    }
}
