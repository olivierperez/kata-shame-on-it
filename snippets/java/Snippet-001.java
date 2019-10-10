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
    }

    public enum Type {
        BREAD, CANDY
    }
}