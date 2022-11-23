package test118

class NonDataClass(val name: String, val email: String, val age: Int)
data class DataClass(val name: String, val email: String, val age: Int)

fun main() {
    val non1 = NonDataClass("kkang", "a@a.com", 10)
    val non2 = NonDataClass("kkang", "a@a.com", 10)
    val data1 = DataClass("kkang", "a@a.com", 10)
    val data2 = DataClass("kkang", "a@a.com", 10)

    println("non data class equals : ${non1.equals(non2)}")
    println("data class equals : ${data1.equals(data2)}")

    println("non data class toString : ${non1.toString()}")
    println("data class toString : ${data1.toString()}")
}