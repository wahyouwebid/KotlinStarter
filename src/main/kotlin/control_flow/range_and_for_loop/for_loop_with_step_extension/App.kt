package control_flow.range_and_for_loop.for_loop_with_step_extension

fun main() {
    val ranges = 1.rangeTo(10) step 3

    for (i in ranges ){
        println("value is $i!")
    }
}