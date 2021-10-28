package fr.o80.kata.snippet1

data class Product(val type: Type)

enum class Type {
    BREAD, CANDY
}

class PriceCalculator {
    fun price(product: Product): Float {
        return when (product.type) {
            Type.BREAD -> 3f
            Type.CANDY -> 0.49f
        }
    }

    fun discount(product: Product, count: Int): Float {
        return when (product.type) {
            Type.BREAD -> if (count >= 10) 0.1f else 0f
            Type.CANDY -> if (count >= 100) 0.12f else 0f
        }
    }
}
