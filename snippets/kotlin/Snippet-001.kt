package fr.o80.kata

data class Product(val type: Type)

enum class Type {
    BREAD, CANDY
}

class PriceCalculator {
    fun price(product: Product): Float {
        return when (product.type) {
            BREAD -> 3
            CANDY -> 0.49
        }
    }

    fun discount(product: Product, count: Int): Float {
        return when (product.type) {
            BREAD -> if (count >= 10) 0.1 else 0
            CANDY -> if (count >= 100) 0.12 else 0
        }
    }
}
