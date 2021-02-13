package kotlin_fundamental.if_expression.if_as_a_expression

fun main() {
    val brotherAge = 20
    val myAge = 26

    val age : String = if (myAge > brotherAge) {
        "Saya Lebih Tua"
    }else {
        "Saya Lebih Muda"
    }

    print(age)
}