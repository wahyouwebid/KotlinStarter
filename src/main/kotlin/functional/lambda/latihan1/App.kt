package functional.lambda.latihan1

fun main() {
    printMessage("Hello From Lambda")
}

val printMessage = { message: String -> println(message) }