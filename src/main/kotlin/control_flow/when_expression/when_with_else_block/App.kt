package control_flow.when_expression.when_with_else_block

fun main() {

    when(6){
        1 -> println("value is 1")
        2 -> println("value is 2")
        3 -> println("value is 3")
        4 -> println("value is 4")
        5 -> println("value is 5")
        else -> println("value cannot be reached")
    }
}