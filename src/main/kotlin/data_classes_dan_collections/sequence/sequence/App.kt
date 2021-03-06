package data_classes_dan_collections.sequence.sequence

fun main() {
    val list = (1..1000000).toList()
    list.asSequence().filter { it % 5 == 0 }.map { it + it }.forEach { println(it) }
}