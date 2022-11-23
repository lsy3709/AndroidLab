package test128

fun main() {
    val some: (Int) -> Unit = {println(it)}
    some(10)

    val some2 = {no1: Int, no2: Int ->
        println("in lambda function")
        no1 * no2
    }
    println("result : ${some2(10, 20)}")

}