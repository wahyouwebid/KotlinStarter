package kotlin_fundamental.functional

fun main() {
    getUser("wahyouwebid")
    val course = setCourse("Memulai Pemrograman Dengan Kotlin", "Programming", 120)
    print(course)
}

fun setCourse(name: String, category: String, duration: Int) =
    "Course Name $name, Category $category, Duration $duration"

fun getUser(name: String) {
    println("My Name $name")
}