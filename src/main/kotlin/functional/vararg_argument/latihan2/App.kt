package functional.vararg_argument.latihan2

fun main() {
    sets(10, 10, name = "Kotlin")
}

fun sets(vararg number: Int, name: String): Int {
    println(name)
    return number.sum()
}