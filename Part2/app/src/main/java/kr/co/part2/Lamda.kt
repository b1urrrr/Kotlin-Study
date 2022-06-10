package kr.co.part2

// 1. Lamda
// 람다식은 우리가 마치 value처럼 다룰 수 있는 함수이다.
// 람다의 기본 정의
// val lamdaName: Type = { argumentList -> codeBody }

val square: (Int) -> (Int) = { number -> number * number }
val nameAge = {name: String, age: Int ->
    "My name is ${name}. I'm ${age}."}

fun main() {
    println(square(12))
    println(nameAge("Chaeyeon", 99))

    val a = "Chaeyeon said"
    val b = "Subin said"
    println(a.pizzaIsGreat())
    println(b.pizzaIsGreat())

    println(extendString("Chaeyeon", 23))

    println(calculateGrade(97))
    println(calculateGrade(970))

    val lamda = {number: Double ->
        number == 4.3213
    }
    println(invokeLamda(lamda))
    println(invokeLamda({true}))
    println(invokeLamda({it > 3.22}))
    println(invokeLamda { it > 3.22 })
}

// 확장함수
val pizzaIsGreat: String.() -> String = {
    this + "Pizza is the  best!"
}

fun extendString(name: String, age: Int): String {
    val introduceMyself: String.(Int) -> String = {"I am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}


// 람다의 return
val calculateGrade: (Int) -> String = {
    when(it) {
        in 0..40 -> "fail"
        in 41..70 -> "pass"
        in 71..100 -> "perfect"
        else -> "Error"
    }
}

// 람다를 표현하는 2가지 방법
fun invokeLamda(lamda: (Double) -> Boolean): Boolean {
    return lamda(5.2343)
}