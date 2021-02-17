package coroutines.memulai_coroutines.latihan2

import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking

suspend fun getCapital(): Int {
    delay(1000L)
    return 50000
}

suspend fun getIncome(): Int {
    delay(1000L)
    return 75000
}

fun main() = runBlocking {
    val capital = getCapital()
    val income = getIncome()
    println("Your profit is ${income - capital}")
}
