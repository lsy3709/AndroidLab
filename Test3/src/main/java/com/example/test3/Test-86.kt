package test86



//data type.............
fun someFun() {
    var data1: Int = 10
    var data2: Int? = null // null 대입 가능
    data1 = data1 + 10
    data1 = data1.plus(10) // 객체의 메서드 이용 가능
}

//string .............
fun main() {
    val str1 = "Hello \n World"
    val str2 = """
    Hello
    World
    """
    println("str1 : $str1")
    println("str2 : $str2")


    //string template.............
    fun sum(no: Int): Int {
        var sum = 0
        for (i in 1..no) {
            sum += i
        }
        return sum
    }
    val name: String = "kkang"
    println("name : $name, sum : ${sum(10)}, plus : ${10 + 20}")

    //nullable, non-nullable
    var data1: Int = 10
//    data1 = null // 오류!
    var data2: Int? = 10
    data2 = null


    //함수 선언.................
    fun some(data1: Int, data2: Int): Int {
        return data1 * data2
    }
    println(some(10, 20))
    some(data2 = 20, data1 = 10)

    var mutableList = mutableListOf<Int>(10, 20, 30)
    mutableList.add(3, 40)
    mutableList.set(0, 50)

    //map......................
    var map = mapOf<String, String>(Pair("one", "hello"), "two" to "world")
    println(
        """
    map size : ${map.size}
    map data : ${map.get("one")}, ${map.get("two")}
    """
    )
}




