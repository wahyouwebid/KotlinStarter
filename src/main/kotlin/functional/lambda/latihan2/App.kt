package functional.lambda.latihan2

fun main() {
    val length = messageLength("Hello From lambda")
    println("Message length $length")
}

val messageLength = { message: String -> message.length }