package nullsafe

import java.util.Scanner

fun nullexp (){

    // to learn about toIntornull()

    println("Enter the number : ")

    val input = readln()

    val inputAsInteger = input.toIntOrNull()

    println(inputAsInteger)
}