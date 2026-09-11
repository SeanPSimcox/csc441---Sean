package week3fri

fun main() {

    //Step 1 - Ranges
    for (i in 1..5){
        print("$i ")
    }
    print("/ ")

    for (letter in 'a'..'e'){
        print("$letter ")
    }
    println()

    //Step 2 - Counting other ways

    for (i in 10 downTo 1){
        print("$i ")
    }
    println()

    for (i in 0..100 step 25){
        print("$i ")
    }
    println()

    //Looping a list

    val shoppingList = mutableListOf("Milk", "Bread", "Coffee")

    for (item in shoppingList){
        println(item)
    }

    for ((index, item) in shoppingList.withIndex()){
        println("$index : $item")
    }

    shoppingList.forEachIndexed { index, item ->
        println("$index : $item")
    }

    //Step 4 - until, and an index mistake

    for (i in 0 until shoppingList.size){
        println("$i : ${shoppingList[i]}")
    }

    //Step 5 - when

    val day = "Tuesday"

    when (day) {
        "Monday" -> println("5 days till weekend")
        "Tuesday" -> println("4 days till weekend")
        "Wednesday" -> println("3 days till weekend")
        else -> println("weekend is close")
    }

    //step 6 - when that produces a value, and a trap

    val age = 40
    val amIOld = when (age) {
        in 1..50 -> false
        in 20..100 -> true
        else -> true
    }

    println(amIOld)

    //Step 7 - if that produces a value

    val years = 10
    val level = if (years > 20) "Senior" else "Junior"
    println(level)

}