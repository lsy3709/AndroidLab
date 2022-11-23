package test115

open class Super {
    open var someData = 10
    open fun someFun() {
        println("i am super class function : $someData")
    }
}
class Sub: Super() {
    override var someData = 20
    override fun someFun() {
        println("i am sub class function : $someData")
    }
}
fun main() {
    val obj = Sub()
    obj.someFun()
}