package control_flow.range_and_for_loop.range_with_iin_operator

fun main() {
    val tenToOne = 10.downTo(1)
    if (11 !in tenToOne) {
        println("No value 11 in Range ")
    }
}