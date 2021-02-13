package control_flow.range_and_for_loop.for_loop_index

fun main() {
    val ranges = 1.rangeTo(10) step 3

    for ((index, value) in ranges.withIndex()) {
        println("value $value with index $index")
    }
}