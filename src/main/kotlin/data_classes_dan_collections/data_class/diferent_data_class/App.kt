package data_classes_dan_collections.data_class.diferent_data_class

class User(val name : String, val age : Int)

data class DataUser(val name : String, val age : Int)

fun main(){
    val user = User("wahyouwebid", 26)
    val dataUser = DataUser("wahyouwebid", 26)

    println(user)
    println(dataUser)
}