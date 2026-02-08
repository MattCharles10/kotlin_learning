package Lambdas

class lamda {

    //Basic lamda
    val square : (Int) -> Int = {x -> x*x}

    // it keywords
    val double :  (Int) -> Int = {it * 2}


    // Lambda with multiple statements
    var str = "Lamda"

    val process: (String) -> String = { input ->
        println("Processing $input")
        input.uppercase()
    }

   /* // Lambda as function parameter
    listOf(1, 2, 3).forEach { number ->
        println(number)
    }

    // Implicit 'it'
    listOf("a", "b", "c").forEach { println(it) } */

}