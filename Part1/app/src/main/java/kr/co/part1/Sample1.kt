package kr.co.part1

fun main() {
    helloWorld()
    println(add(4, 5))
    checkNum(1)
    forAndWhile()
    nullcheck()


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
fun array() {
    val array = arrayOf(1, 2, 3)
    val list = listOf(1, 2, 3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
}


// 6. For & While
fun forAndWhile() {
    val students = arrayListOf("joyce", "james", "jenny", "jennifer")
    for (name in students) {
        println("${name}")
    }

    for ((index, name) in students.withIndex()) {
        println("${index + 1} 번째 학생 : ${name}")
    }

    var sum = 0
    for (i in 1..100) {
        sum += i
    }
    println(sum)

    var index = 0
    while(index < 10) {
        println("current index : ${index}")
        index++
    }
}


// 7. Nullable / NonNull
fun nullcheck() {
    // NPE : Null pointer Exception
    var name = "Chaeyeon"
    var nullName: String? = null // nullable
    var nameInUpperCase = name.toUpperCase()
    var nullNameInUpperCase = nullName?.toUpperCase() // nullable (null이면 null 반환)

    // ?:
    val lastName: String? = null
    val fullName = name + " " + (lastName?: "NO lastname")
    println(fullName)

    // !!

}

fun ignoreNulls(str: String?) {
    val mNotNull : String = str!!
    val upper = mNotNull.toUpperCase()

    val email: String? = "chaeyeon@nana.vom"
    email?.let { // let : 자신의 리시버 객체(email)를 람다식 내부로 옮겨 실행
        println("My email is ${email}")
    }
}


