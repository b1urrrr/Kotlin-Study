package kr.co.part2

data class Ticket(val companyName: String, val name: String, var date: String, val seatNumber: Int)

class TicketNormal(val companyName: String, val name: String, var date: String, val seatNumber: Int)

// toString(), hashCode(), equals(), copy()

fun main() {
    val ticketA = Ticket("koreanAir", "Chaeyeon", "2022-06-10", 14)
    val ticketB = TicketNormal("koreanAir", "Chaeyeon", "2022-06-10", 14)

    println(ticketA) // toString 출력
    println(ticketB) // 메모리 주소값 출력
}