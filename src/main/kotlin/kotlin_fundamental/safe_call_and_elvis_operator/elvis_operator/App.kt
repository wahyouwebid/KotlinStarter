package kotlin_fundamental.safe_call_and_elvis_operator.elvis_operator

fun main() {
    val text: String? = null
    val textLength = text?.length ?: 7

    println(textLength)
}