package functional.advance_collections_function.drop

fun main() {
    val number = listOf(1, 2, 3, 4, 5, 6)
    val drop = number.dropLast(3)

    println(drop)
}