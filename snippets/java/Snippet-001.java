import java.util.Objects;

class PriceCalculator {

    public class Bread implements Product {

        public static final float DISCOUNT_PERCENT = 0.1f;
        public static final int DISCOUNT_THRESHOLD = 10;
        public static final int NO_DISCOUNT = 0;

        public Float price() {
            return 3f;
        }

        public Float discount(Integer productQuantity) {
            return productQuantity >= DISCOUNT_THRESHOLD ? DISCOUNT_PERCENT : NO_DISCOUNT;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            return o != null && getClass() == o.getClass();
        }

        @Override
        public int hashCode() {
            return Objects.hash(this);
        }

        @Override
        public String toString() {
            return "Product{type=BREAD}";
        }
    }

    public class Candy implements Product {

        public static final int DISCOUNT_THRESHOLD = 100;
        public static final float DISCOUNT_PERCENT = 0.12f;
        public static final int NO_DISCOUNT = 0;

        public Float price() {
            return 0.49f;
        }

        public Float discount(Integer productQuantity) {
            return productQuantity >= DISCOUNT_THRESHOLD ? DISCOUNT_PERCENT : NO_DISCOUNT;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            return o != null && getClass() == o.getClass();
        }

        @Override
        public int hashCode() {
            return Objects.hash(this);
        }

        @Override
        public String toString() {
            return "Product{type=CANDY}";
        }
    }

    public interface Product {
        Float price();

        Float discount(Integer count);
    }
}