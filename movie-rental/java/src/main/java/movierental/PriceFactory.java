package movierental;

/**
 * Created by GEJO on 5/1/2014.
 */
public class PriceFactory {
    public static final int CHILDRENS = 2;
    public static final int NEW_RELEASE = 1;
    public static final int REGULAR = 0;

    public static Price getPrice(int priceCode) {
        switch (priceCode) {
            case REGULAR:
                return Price.RegularPrice;
            case NEW_RELEASE:
                return Price.NewReleasePrice;
            case CHILDRENS:
                return Price.ChildrenPrice;
        }
        return null;
    }
}
