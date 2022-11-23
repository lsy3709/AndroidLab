package test122

open class Super {
    open var data = 10
    open fun some() {
        println("i am super some() : $data")
    }
}
val obj = object: Super() {
    override var data = 20
    override fun some() {
        println("i am object some() : $data")
    }
}
fun main() {
    obj.data = 30 // 성공!
    obj.some() // 성공!
}