package list

fun basiclist(){

    val fruits = listOf<String>("apple" , "orange" , "banna" , "grape" , "orange")

    println(fruits) // print the read - only fruits

    println("third fruits in ${fruits[2]}") // print third fruits in the list

    println("has kiwi ${"kiwi" in fruits}")

    println("first  ${fruits.first()} , last ${fruits.last()}" )
}