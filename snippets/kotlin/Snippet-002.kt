data class Product(
    val type: Int,
    val price: Float
) {
    val foodType = 19

    fun isFood(): Boolean = this.type == foodType
}


fun getNumberOfProductThatAreAboutFood(list: List<Product>): Int {
    return list
        .filter { it.isFood() }
        .size
}
