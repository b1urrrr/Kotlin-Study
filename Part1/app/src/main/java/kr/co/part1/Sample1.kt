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


// 1. 함수
fun helloWorld() {
    println("Hello World!")
}

fun add(a: Int, b: Int): Int {
    return a + b
}


// 2. val vs var
fun hi() {
    val a: Int = 10
    var b: Int = 9
    b = 100

    val c = 100
    var d = 100
    var name = "Chaeyeon"
}


// 4. 조건식
fun maxBy(a: Int, b: Int): Int {
    if (a > b) return a
    else return b
}

fun maxBy2(a: Int, b: Int) = if (a > b) a else b

fun checkNum(score: Int) {
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
    }

    var b = when(score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    println("${b}")

    when (score) {
        in 90..100 -> println("You are genius!")
        in 10..80 -> println("Not bad")
        else -> println("Okay")
    }
}

// 5. Array and List
