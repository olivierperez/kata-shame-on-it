class Product {
    constructor ({type, price} = {}) {
        this.type = type;
        this.price = price;
    }
}

/**
 * Get the products that are about food.
 */
function get(list) {
    let ret = []
    for (let x in list) {
        if (x.type !== 19) {
            continue;
        }
        ret.push(x)
    }
    return ret.size
}