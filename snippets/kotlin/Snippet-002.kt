data class Product(
    val type: Int,
    val price: Float
)

/**
 * Get the products that are about food.
 */
fun get(list: List<Product>): Int {
    val ret = mutableListOf<Product>()
    for (x in list) {
        if (x.type != 19) {
            continue
        }
        ret.add(x)
    }
    return ret.size
}