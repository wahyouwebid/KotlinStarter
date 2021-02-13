package kotlin_fundamental.if_expression.if_else

fun main(){
    val brotherAge = 20
    val myAge = 26
    val age : String

    if (myAge > brotherAge) {
        age = "Saya Lebih Tua"
    }else {
        age = "Saya Lebih Muda"
    }

    print(age)
}