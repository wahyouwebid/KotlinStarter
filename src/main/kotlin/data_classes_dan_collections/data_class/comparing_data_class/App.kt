package data_classes_dan_collections.data_class.comparing_data_class

data class DataUser(val name : String, val age : Int)

fun main(){
    val dataUser = DataUser("wahyouwebid", 26)
    val dataUser2 = DataUser("wahyouwebid", 26)
    val dataUser3 = DataUser("ujang", 24)

    println(dataUser == dataUser2)
    println(dataUser == dataUser3)

}