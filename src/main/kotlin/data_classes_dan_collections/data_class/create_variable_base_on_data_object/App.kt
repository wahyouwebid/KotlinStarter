package data_classes_dan_collections.data_class.create_variable_base_on_data_object

data class DataUser(val name : String, val age : Int)

fun main(){
    val dataUser = DataUser("wahyouwebid", 17)
    val (name, age) = dataUser

    println("My name is $name, I am $age years old")
}