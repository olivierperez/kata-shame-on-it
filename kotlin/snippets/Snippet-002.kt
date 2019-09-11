package fr.o80.kata

data class Product(
    val type: Int,
    val price: Float
)

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