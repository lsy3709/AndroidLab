package test108

//class User(name: String, count: Int) {
//    // 클래스 멤버 변수 선언
//    var name: String
//    var count: Int
//    init {
//        // 클래스 멤버 변수에 생성자 매개변숫값 대입
//        this.name = name
//        this.count = count
//    }
//    fun someFun() {
//        println("name : $name, count : $count") // 성공!
//    }
//}

class User(val name: String, val count: Int) {
    fun someFun() {
        println("name : $name, count : $count") // 성공!
    }
}
fun main() {
    val user = User("kkang", 10)
    user.someFun()
}