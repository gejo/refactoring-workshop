package movierental;

public class Movie {

    private String _title;
    private int _priceCode;

    private Price price;

    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
        price = PriceFactory.getPrice(priceCode);
    }

    public Price getPrice() {
        return price;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        _priceCode = arg;price =PriceFactory.getPrice(_priceCode);
    }
    public String getTitle() {
        return _title;
    }


    double getCharge(int daysRented) {
        return getPrice().getCharge(daysRented);

    }
}
