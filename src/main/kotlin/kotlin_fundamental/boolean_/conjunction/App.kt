package kotlin_fundamental.boolean_.conjunction

fun main() {
    val officeOpen = 7
    val officeClosed = 16
    val now = 20

    val isOpen = now in officeOpen..officeClosed

    print("Office is open : $isOpen")
}