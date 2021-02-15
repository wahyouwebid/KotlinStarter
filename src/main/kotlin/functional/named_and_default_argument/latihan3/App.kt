package functional.named_and_default_argument.latihan3

fun main() {
    val fullName = getFullName()
    print(fullName)
}

fun getFullName(
    first: String = "Kotlin",
    middle: String = " is ",
    last: String = "Awesome"): String {
    return "$first $middle $last"
}