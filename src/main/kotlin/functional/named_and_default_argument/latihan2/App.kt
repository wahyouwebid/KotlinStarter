package functional.named_and_default_argument.latihan2

fun main() {
    val fullName = getFullName(middle = " is " , first = "Kotlin", last = "Awesome")
    print(fullName)
}

fun getFullName(first: String, middle: String, last: String): String {
    return "$first $middle $last"
}