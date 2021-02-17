package object_oriented.constructor.latihan4

class Animal{
    val name: String = "Meong"
    val weight: Double = 4.2
    val age: Int = 2
    val isMammal: Boolean = true
}

fun main(){
    val cat = Animal()
    println("Nama: ${cat.name}, Berat: ${cat.weight}, Umur: ${cat.age}, mamalia: ${cat.isMammal}" )
}