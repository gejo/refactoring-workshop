package movierental;

/**
 * Created by GEJO on 5/1/2014.
 */
public enum Price {
    RegularPrice {
        double getCharge(int daysRented) {
            double amount = 2;
            if (daysRented > 2)
                amount += (daysRented - 2) * 1.5;
            return amount;
        }
    },

    NewReleasePrice {
        double getCharge(int daysRented) {
            return daysRented * 3;
        }
    },

    ChildrenPrice {
        double getCharge(int daysRented) {
            double amount = 1.5;
            if (daysRented > 3)
                amount += (daysRented - 3) * 1.5;
            return amount;
        }
    };

    abstract double getCharge(int daysRented);

}
