data class Price(private val value: Float)
data class Discount(private val rate: Float)

interface Product {
    fun price(): Price

    fun discount(count: Int): Discount
}

class Bread: Product {
    override fun price(): Price = Price(3f)

    override fun discount(count: Int): Discount = if (count >= 10) Discount(0.1f) else Discount(0f)
}

class Candy: Product {
    override fun price(): Price = Price(0.49f)

    override fun discount(count: Int): Discount = if (count >= 100) Discount(0.12f) else Discount(0f)
}
