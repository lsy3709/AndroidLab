package test92

fun main() {
    //array.............
    val data1: Array<Int> = Array(3, { 0 })
    data1[0] = 10
    data1[1] = 20
    data1.set(2, 30)
    println(
        """
    array size : ${data1.size}
    array data : ${data1[0]}, ${data1[1]}, ${data1.get(2)}
    """
    )

    val data2: IntArray = IntArray(3, { 0 })
    val data3: BooleanArray = BooleanArray(3, { false })

    val data4 = arrayOf<Int>(10, 20, 30)
    val data5 = intArrayOf(10, 20, 30)
    val data6 = booleanArrayOf(true, false, true)


    //list.............
    var list = listOf<Int>(10, 20, 30)
    println(
        """
    list size : ${list.size}
    list data : ${list[0]}, ${list.get(1)}, ${list.get(2)}
    """
    )
}