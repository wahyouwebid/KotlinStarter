package functional.vararg_argument.latihan1

fun main() {
    val number = sumNumbers(10, 20, 30, 40)
    print(number)
}

fun sumNumbers(vararg number: Int): Int {
    return number.sum()
}