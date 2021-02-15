package functional.lambda.latihan4

fun main() {
    printResult(10){ value ->
        value + value
    }
}

fun printResult(value: Int, sum: (Int) -> Int) {
    val result = sum(value)
    println(result)
}