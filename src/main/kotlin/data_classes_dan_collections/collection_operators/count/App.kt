package data_classes_dan_collections.collection_operators.count

fun main() {
    val numberList = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)

    print(numberList.count())
    print(numberList.count { it % 3 == 0 })
}