package com.example.test3

import java.text.SimpleDateFormat
import java.util.*
var data = 10
fun formatDate(date: Date): String {
    val sdformat = SimpleDateFormat("yyyy-mm-dd")
    return sdformat.format(date)
}
class User {
    var name = "hello"
    fun sayHello() {
        println("name : $name")
    }
}
