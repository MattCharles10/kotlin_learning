package nullsafe

fun getUserAge( ) {

    println("How old are you ? ")

    val input = readlnOrNull()

    val age = input?.toIntOrNull()

    if (age == null) {
        println("That's not a valid number!")
    } else if (age < 0) {
        println("Age can't be negative!")
    } else if (age > 150) {
        println("Are you sure about that?")
    } else {
        println("Great! You are $age years old.")
    }
}