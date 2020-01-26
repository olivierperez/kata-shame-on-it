import java.math.BigDecimal;
import java.util.List;

class Product {
    private ProductType type;
    private BigDecimal price;

    public Product(ProductType type, BigDecimal price) {
        this.type = type;
        this.price = price;
    }

    public int getType() { return type.id; }

    public BigDecimal getPrice() {
        return price;
    }

    public boolean isFood() {
        return type == ProductType.Food;
    }
}

class Products {
    public static long countFoodProducts(List<Product> products) {
        return products.stream()
                .filter(Product::isFood)
                .count();
    }
}

enum ProductType {
    Other(0),
    Food(19),
    ;

    public final int id;

    ProductType(int id) {
        this.id = id;
    }
}