package control_flow.latihan

fun main() {
    val listNumber = 1.rangeTo(100)

    for (number in listNumber) {
        // jika genap maka dilanjutkan
        if (number % 2 == 0) continue

        // jika number lebih besar dari 15 maka berhenti
        if (number > 15) break

        // TODO 3
        val result = number * ( number + 10 )
        println("range result is $result")
    }
}