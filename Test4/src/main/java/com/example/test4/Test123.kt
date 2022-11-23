package test123

class MyClass {
    companion object {
        var data = 10
        fun some() {
            println(data)
        }
    }
}
fun main() {
    MyClass.data = 20 // 성공!
    MyClass.some() // 성공!
}