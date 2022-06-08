package kr.co.part1

fun main() {
    helloWorld()
    println(add(4, 5))
    checkNum(1)

    // 3. String Template
    val name = "Chaeyeon"
    println("my name is $name")
    println("my name is ${name}!")

    val lastName = "Jeon"
    println("my name is ${name + lastName}!")
    println("This is 2\$A")
}