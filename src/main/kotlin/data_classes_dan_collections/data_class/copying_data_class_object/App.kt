package data_classes_dan_collections.data_class.copying_data_class_object

data class DataUser(val name : String, val age : Int)

fun main(){
    val dataUser = DataUser("wahyouwebid", 26)
    val dataUser2 = dataUser.copy()

    println(dataUser2)

}