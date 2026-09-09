package week3wed

fun main()
{
    println("---Step 1 - main and output---")
    println("CSC 441")
    println("Kotlin, first day.")

    println("---Step 2 - val and var---")
    val course = "CSC 441"
    var weekNumber = 3
    weekNumber += 1

    println(course)
    println(weekNumber)

    println("---Step 3 - the four basic type")
    val name = "Dzemal"
    val age = 38
    val gpa = 3.75
    val teaching = true

    println(name)
    println(age)
    println(gpa)
    println(teaching)

    println("---Step 4 - string templates")
    println("$name teaches $course")
    println("$name teaches $course")
//    println(name + "teaches" + course) -control / to mark out-

    println("Next year: ${age + 1}")
    println("name length: ${name.length}")

    println("---Step 5 - Reading input")
    print("whats your name?")
    val yourName = readlnOrNull()
    println("Hello, $yourName")

}