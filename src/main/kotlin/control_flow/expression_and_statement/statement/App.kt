package control_flow.expression_and_statement.statement

fun main() {

    val value1 = 10
    val value2 = 10

    val result = sum(value1, value2)
    println(result)
}

fun sum(value1: Int, value2: Int) = value1 + value2