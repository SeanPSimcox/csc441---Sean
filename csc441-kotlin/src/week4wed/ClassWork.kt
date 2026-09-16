package week4wed

fun main(){
    println("--- Step 1: function returning nothing ---")
    todaysExcercise()

//    println("--- Step 2: function returning a value ---")
//    println(todaysExcercise1())
//
//    println("--- Step 3: a parameter ---")
//
//    println(todaysExcercise2(9))
//    println("--- Step 4: the short form ---")
//
//    println("--- Step 5: function returning nothing ---")
//    println(todaysExcercise4())
//    println(todaysExcercise4(dayNumber))
//
//    println("---Step 6: two parameters, and naming them ---")
//    println(todaysExcercise5(dayNumber = 2, name= "Dzemal"))
//    println(todaysExercise5(name ="Sam"))
}

fun todaysExcercise(){
    println("Push-ups")
}

fun todaysExercise1(): String{
    return "Push-ups"
}

fun todaysExercise2(dayNumber: Int): String {
    return when (dayNumber) {
        1 -> "Push-ups"
        2 -> "Running"
        3 -> "Swimming"
        4 -> "Cycling"
        5 -> "Gym"
        else -> "Rest day"
    }
}

fun todaysExcercise3(dayNumber: Int): String = when(dayNumber) {
    1 -> "Push-ups"
    2 -> "Running"
    3 -> "Swimming"
    4 -> "Cycling"
    5 -> "Gym"
    else -> "Rest day"

}
fun todaysExercise4(dayNumber: Int): String = when(dayNumber) {}

fun todaysExercise5(dayNumber: Int = 1, name: String = "you"): String {
    val excercise = when(dayNumber) {
        1 -> "Push-ups"
        2 -> "Running"
        3 -> "Swimming"
        4 -> "Cycling"
        5 -> "Gym"
        else -> "Rest day"
    }
    return "$name: $excercise"
}