package object_oriented.constructor.latihan1

class Animal(val name: String, val weight: Double, val age: Int, val isMammal: Boolean)

fun main() {
    val dicodingCat = Animal("Meong", 4.2, 2, true)
    println("Nama: ${dicodingCat.name}, Berat: ${dicodingCat.weight}, Umur: ${dicodingCat.age}, mamalia: ${dicodingCat.isMammal}")
}