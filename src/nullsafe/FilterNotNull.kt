package nullsafe

fun FilterNotNull(){

    val strings = listOf("10", "20", "invalid", "30" )

    val numbers = strings.map { it.toIntOrNull() }.filterNotNull()

    println(numbers)
}