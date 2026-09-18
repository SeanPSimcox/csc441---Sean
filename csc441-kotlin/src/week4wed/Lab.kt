package week4wed

fun main() {
    println("---Step 1: Function returning nothing---")
    describeToday()

    println("---Step 2: function returning a value---")
    println("My favor thing is ${favoriteThing()}")

    println("---Step 3: a parameter ---")
    println(pickOne(3))
    println(pickOne(6))

    println("---Step 4: short form ---")
    println(pickOneShort(3))

    println("---Step 5: default value ---")
    println(pickWithDefault(1, "Me"))
    println(pickWithDefault(name = "You"))

}

fun describeToday() {
    println("Im over today.")
}

fun favoriteThing(): String {
    return "CSC 441."
}

fun pickOne(number: Int): String {
    return when (number) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        else -> "Not important."
    }
}

fun pickOneShort(number: Int): String = when (number) {
    1 -> "One"
    2 -> "Two"
    3 -> "Three"
    4 -> "Four"
    5 -> "Five"
    else -> "Not important."
}

fun pickWithDefault(number: Int = 1, name: String = "you"): String {
    val number = when (number) {
        1 -> "One"
        2 -> "Two"
        3 -> "Three"
        4 -> "Four"
        5 -> "Five"
        else -> "Not important."
    }
    return "$number: $name"
}
