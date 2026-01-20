package nullsafe

fun MapNotNull(){

    val strings = listOf("1" , "2" , "three" , "4" , "five")
    val numbers = strings.mapNotNull { it.toIntOrNull() }

    println(numbers)

}