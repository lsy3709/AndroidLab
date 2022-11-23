package test85

//변수선언하기 -----------------------
val data1 = 10
var data2 = 10

fun main() {
//    data1 = 20 // 오류!
    data2 = 20 // 성공!


    //lazy...
    println("in main.....")
    println(data8+10)
    println(data8+10)
}

//초기값 할당...............................

//val data3:Int//error
val data4 = 10

class User {
//    val data3: Int//error
    val data4 = 10
}

fun someFun() {
    val data3:Int
//    println("data3: $data3")//error
    data3=10
    println("data3: $data3")
}
//lateinit, lazy...............
//lateinit var data5: Int//error
//lateinit val data6: String//error
lateinit var data7: String//ok

val data8 by lazy {
    println("in lazy.....")
    10
}





