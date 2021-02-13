package control_flow.when_expression.when_with_range

fun main() {
    val value =  5
    val ranges = 1..5

    when(value){
        in ranges -> println("value is in the range")
        !in ranges -> println("value is outside the range")
        else -> println("value undefined")
    }
}