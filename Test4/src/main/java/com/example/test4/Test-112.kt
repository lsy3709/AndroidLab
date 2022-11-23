package com.example.test4

class User(name: String) {
    constructor(name: String, count: Int): this(name) {
        println("constructor(name: String) call...")
    }
    constructor(name: String, count: Int, email: String): this(name, count) {
        println("constructor(name: String, count: Int, email: String) call...")
    }
}
fun main() {
    val user = User("kkang", 10, "a@a.com")
}