package functional.named_and_default_argument.latihan4

fun main() {
    val fullName = getFullName(first = "Dicoding")
    print(fullName)
}

fun getFullName(first: String = "Kotlin", middle: String = " is ", last: String = "Awesome"): String {
    return "$first $middle $last"
}