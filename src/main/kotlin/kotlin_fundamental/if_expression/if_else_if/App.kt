package kotlin_fundamental.if_expression.if_else_if

fun main() {
    val brotherAge = 20
    val myAge = 20

    val age : String = if (myAge > brotherAge) {
        "Saya Lebih Tua"
    }else if(myAge == brotherAge) {
        "Umur Kita Sama"
    } else {
        "Saya Lebih Muda"
    }

    print(age)
}