package control_flow.when_expression.multiple_statement

fun main() {
    val stringOfValue = when (4) {
        1 -> {
            println("One")
            "value is 1"
        }
        2 -> {
            println("Two")
            "value is 2"
        }
        3 -> {
            println("Three")
            "value is 3"
        }
        else -> {
            println("undefined")
            "value cannot be reached"
        }
    }

    println(stringOfValue)
}
