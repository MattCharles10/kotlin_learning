package nullsafe

fun comparisonExample( ){

    val validString = "123"
    val invalidString = "abc"

    // Using inInt()

    try{
        println(validString.toInt())
        println(invalidString.toInt())
    }catch ( e : NumberFormatException){
        println("ERROR ${e}")
    }

    println("------------------------------")
    // Using toIntOrNull() - SAFE (returns null)

    println(validString.toIntOrNull())
    println(invalidString.toIntOrNull())
}