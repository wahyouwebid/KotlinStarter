package control_flow.when_expression.when_as_a_expression

fun main() {
    val stringOfValue = when (7) {
        6 -> "value is 6"
        7 -> "value is 7"
        8 -> "value is 8"
        else -> "value cannot be reached"
    }

    println(stringOfValue)
}