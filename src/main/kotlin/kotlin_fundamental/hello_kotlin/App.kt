package kotlin_fundamental.hello_kotlin

fun main() {
    val name = "Ujang Wahyu"
    val pekerjaan = "Android Developer"
    val email = "hello@wahyou.web.id"
    val website = "wahyou.web.id"
    val linkedin = "https://linkedin.com/in/wahyouwebid"
    val github = "https://github.com/wahyouwebid"

    println("Perkenalkan Nama Saya : ")
    println("Nama : $name")
    println("Pekerjaan : $pekerjaan")
    println("Email : $email")
    println("Website : $website")
    println("Linkedin : $linkedin")
    println("Github : $github")



    print(if (true) "Always true" else "Always false")
}

/*
   output:
       Perkenalkan Nama Saya Ujang Wahyu
       Always true
*/