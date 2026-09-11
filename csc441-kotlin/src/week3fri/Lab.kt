package week3fri

fun main() {
    for (i in 1..10){print("$i ")}

    for (i in 20 downTo 1 step 3){ print("$i ") }

    val myStuff = mutableListOf("cell phone", "head phones", "wallet", "watch")
    for (item in myStuff){
        println(item)}

    myStuff.forEachIndexed({ index, item -> println("$index : $item")})

    for (i in 0 until  myStuff.size) {
        println("$i: ${myStuff[i]}")
    }

    print("Enter a number 1-7.")
    val day: Int  = readlnOrNull()?.toInt() ?: 0
    val Wednesday = when(day){
        in 1..2-> "Not humpday"
        in 4..7 -> "Not humpday"
        else -> "Wednesday"
    }
    println(Wednesday)

    val richstatus = if (day == 3) {
        "Rich."
    } else {
        "Not rich."
    }

    println(richstatus)

}