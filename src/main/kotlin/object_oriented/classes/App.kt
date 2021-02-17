package object_oriented.classes

class Animal(val name: String,
             val weight: Double,
             val age: Int,
             val isMammal: Boolean) {

    fun eat() {
        println("$name makan!")
    }

    fun sleep() {
        println("$name tidur!")
    }
}

// main function
fun main() {
    val cat = Animal("Meong", 4.2, 2, true)
    println("Nama: ${cat.name}, Berat: ${cat.weight}, Umur: ${cat.age}, mamalia: ${cat.isMammal}")
    cat.eat()
    cat.sleep()
}