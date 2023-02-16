package extension

/** Returns reference string, or reads another line if it is empty  */
fun String?.getNotEmptyString(): String {
    var input = this
    while (input.isNullOrBlank()) {
        println("값을 입력해주세요")
        input = readLine()
    }
    return input.trim()
}

/** Parses the string as an Int, or reads another line if it is empty */
fun String?.getNotEmptyInt(): Int {
    var input = this?.trim()
    while(input.isNullOrEmpty() || input.toIntOrNull() == null) {
        println("값을 입력해주세요")
        input = readLine()
    }
    return input.toInt()
}