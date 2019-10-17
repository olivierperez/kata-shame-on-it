import java.util.Objects;

class PriceCalculator {
    public Float price(Product product) {
        float price = 0f;
        switch (product.type) {
            case BREAD:
                price = 3f;
                break;
            case CANDY:
                price = 0.49f;
                break;
        }
        return price;
    }

    public Float discount(Product product, Integer count) {
        float discount = 0f;
        switch (product.type) {
            case BREAD:
                discount = count >= 10 ? 0.1f : 0;
                break;
            case CANDY:
                discount = count >= 100 ? 0.12f : 0;
                break;
        }
        return discount;
    }

    public static class Product {
        private Type type;

        public Product(Type type) {
            this.type = type;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Product product = (Product) o;
            return type == product.type;
        }

        @Override
        public int hashCode() {
            return Objects.hash(type);
        }

        @Override
        public String toString() {
            return "Product{" + "type=" + type + '}';
        }
    }

    public enum Type {
        BREAD, CANDY
    }
}