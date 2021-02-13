package control_flow.range_and_for_loop.range_foreach

fun main() {
    val rangeInt = 1..10 step 2

    rangeInt.forEach {
        print("$it ")
    }

    println(rangeInt.step)
}