package com.example.test3

fun main() {
    var data = 10
    val result = if (data > 0) {
        println("data > 0")
        true
    } else {
        println("data <= 0")
        false
    }
    println(result)

    //when..................
    var data2: Any = 10
    val result2 = when (data2) {
        is String -> println("data2 is String") // data가 문자열 타입이면
        20, 30 -> println("data2 is 20 or 30") // data가 20 또는 30이면
        in 1..10 -> println("data2 is 1..10") // data가 1~10의 값이면
        else -> println("dat2a is not valid")
    }
    println(result2)
}