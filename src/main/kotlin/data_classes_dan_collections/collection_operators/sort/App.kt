package data_classes_dan_collections.collection_operators.sort

fun main() {
    val kotlinChar = listOf('k', 'o', 't', 'l', 'i', 'n')
    val ascendingSort = kotlinChar.sorted()
    val descendingSort = kotlinChar.sortedDescending()

    println(ascendingSort)
    println(descendingSort)
}