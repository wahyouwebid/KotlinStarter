package kotlin_fundamental.data_type.array

fun main() {
    val intArray = intArrayOf(1, 3, 5, 7)
    val booleanArray = booleanArrayOf(true, false, true)
    val charArrayOf = charArrayOf('A', 'B', 'C')
    val longArrayOf = longArrayOf(1000, 2000, 3000, 4000)
    val shortArrayOf = shortArrayOf(100, 200, 300, 400)
    val mixArray = arrayOf(1, 3, 5, 7 , "wahyouwebid" , true)

    println(intArray[2])
    println(booleanArray[0])
    println(charArrayOf[1])
    println(longArrayOf[3])
    println(shortArrayOf[2])
    println(mixArray[4])
}