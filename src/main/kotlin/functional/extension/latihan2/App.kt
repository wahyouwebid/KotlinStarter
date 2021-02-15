package functional.extension.latihan2

fun main() {
    println(10.plusThree())
}

fun Int.plusThree(): Int {
    return this + 3
}