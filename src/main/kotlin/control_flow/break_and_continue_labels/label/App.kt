package control_flow.break_and_continue_labels.label

fun main() {
    loop@ for (i in 1..10) {
        println("Outside Loop")

        for (j in 1..10) {
            println("Inside Loop")
            if ( j > 5) break@loop
        }
    }
}