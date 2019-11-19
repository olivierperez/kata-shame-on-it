sealed class Product(val unitPrice: Float, val minQuantityForDiscount: Int, val discountRate: Float){
	fun discount(quantity: Int): Float = if (quantity >= minQuantityForDiscount) discountRate else 0f
}
object Bread : Product(unitPrice = 3f, minQuantityForDiscount = 10, discountRate = 0.1f)
object Candy : Product(unitPrice = 0.49f,minQuantityForDiscount = 100, discountRate = 0.12f)

class PriceCalculator {
	fun price(product: Product): Float = product.unitPrice
	fun discount(product: Product, count: Int): Float = product.discount(count)
}
