const Type = {
    BREAD: 'BREAD', CANDY: 'CANDY'
}

class Product {
    constructor(type) {
        this.type = type;
    }
}


class PriceCalculator {
    price (product) {
        switch (product.type) {
            case Type.BREAD:  return 3;
            case Type.CANDY: return 0.49;
        }
    }

    discount (product, count) {
        switch (product.type) {
            case Type.BREAD: if (count >= 10) return 0.1; else return 0;
            case Type.CANDY: if (count >= 100) return 0.12; else return 0;
        }
    }
}
