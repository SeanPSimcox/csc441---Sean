package week3wed

val name = "Sean"
val major = "CSC"
val favFood = "Taco's"
val String = "Words"
val Int = 69
val Double = 3.14
val Boolean = false

var coursesTaken = 60
var coursesTakenAdd = coursesTaken + 1

fun main() {
    println(name)
    println(major)
    println(favFood)
    println("Courses taken: $coursesTaken")
    println("Course taken after this one: ${coursesTaken + 1}")
    println("$name is studying ${major}.")
    println("$name has ${name.length} letters.")
    print("Where are you from? ")
    val location = readlnOrNull()
    println("${location} is a good place.")

}