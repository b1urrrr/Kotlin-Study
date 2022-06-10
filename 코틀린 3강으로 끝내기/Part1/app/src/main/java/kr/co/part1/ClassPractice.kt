package kr.co.part1

open class Human(val name: String = "Anonymous") {

    constructor(name: String, age: Int): this(name) {
        println("My name is ${name}, ${age}years old")
    }

    init {
        println("New human has been born!!")
    }

    fun eatingCake() {
        println("This is so yummy!")
    }

    open fun singASong() {
        println("lalala")
    }
}

class Korean: Human() {
    override fun singASong() {
        super.singASong()
        println("랄라라~")
        println("My name is ${name}")
    }
}

fun main() {
    val human = Human("minsu")
    human.eatingCake()
    val stranger = Human()
    val mom = Human("Suah", 54)

    println("This human's name is ${human.name}")
    println("This human's name is ${stranger.name}")

    val korean = Korean()
    korean.singASong()
}