package control_flow.while_and_do_while.infinite_while

fun main() {
    var value = 'A'
    do {
        value++
        print(value)
    } while (value <= 'Z')
}