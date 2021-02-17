package object_oriented.properties

class Animal{
    var name: String = "Meong"
        get(){
            println("Fungsi Getter terpanggil")
            return field
        }
        set(value){
            println("Fungsi Setter terpanggil")
            field = value
        }
}

// main function
fun main(){
    val cat = Animal()
    println("Nama: ${cat.name}" )
    cat.name = "Elisabet"
    println("Nama: ${cat.name}")
}