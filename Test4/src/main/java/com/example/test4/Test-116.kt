package test116

open class Super {
    var publicData = 10
    protected var protectedData = 20
    private var privateData = 30
}

class Sub: Super() {
    fun subFun() {
        publicData++ // 성공!
        protectedData++ // 성공!
//        privateData++ // 오류!
    }
}
fun main() {
    val obj = Super()
    obj.publicData++ // 성공!
//    obj.protectedData++ // 오류!
//    obj.privateData++ // 오류!
}