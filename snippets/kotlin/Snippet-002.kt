data class Product(
	val type: Int,
	val price: Float
)

const val notFoodType = 19
fun numberOfFoodProducts(products: List<Product>): Int =
	products.filter { it.type != notFoodType }.count()

// nommage de x et list, ret, methode get retourne une taille
// liste mutable
