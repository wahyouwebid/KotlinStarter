package data_classes_dan_collections.data_class.destructuring_declaration

data class DataUser(val name : String, val age : Int)

fun main(){
    val dataUser = DataUser("wahyouwebid", 26)

    val name = dataUser.component1()
    val age = dataUser.component2()

    println("My name is $name, I am $age years old")
}