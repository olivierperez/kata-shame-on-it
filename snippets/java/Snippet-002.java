import java.util.ArrayList;
import java.util.List;

class Product {
    private Integer type;
    private Float price;

    public Product(Integer type, Float price) {
        this.type = type;
        this.price = price;
    }

    public Integer getType() {
        return type;
    }

    public Float getPrice() {
        return price;
    }

    /**
     * Get the products that are about food.
     */
    public static Integer get(List<Product> list) {
        List<Product> ret = new ArrayList<>();

        for (Product x : list) {

            if (x.type != 19) {
                continue;
            }
            ret.add(x);
        }

        return ret.size();
    }
}