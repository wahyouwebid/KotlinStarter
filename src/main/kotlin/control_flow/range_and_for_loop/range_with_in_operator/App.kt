package control_flow.range_and_for_loop.range_with_in_operator

fun main() {
    val tenToOne = 10.downTo(1)
    if (7 in tenToOne) {
        println("Value 7 available")
    }
}