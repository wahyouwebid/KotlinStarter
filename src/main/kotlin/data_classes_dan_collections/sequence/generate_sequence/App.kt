package data_classes_dan_collections.sequence.generate_sequence

fun main() {
    val sequenceNumber = generateSequence(1) { it + 1 }
    sequenceNumber.take(5).forEach { print("$it ") }
}