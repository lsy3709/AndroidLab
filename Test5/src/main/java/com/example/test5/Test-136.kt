package test136

fun some(data: String?): Int {
    return data!!.length
}

fun main() {
    var data: String? = "kkang"
    println("data = $data : ${data?.length ?: -1}")
    data = null
    println("data = $data : ${data?.length ?: -1}")

    println(some("kkang"))
    println(some(null))
}