package nullsafe

fun ElivsOp(){

    println("Enter the number : ")
    val input = readlnOrNull()

    val inputAsInteger = input?.toIntOrNull() ?: 0 // Default to 0 if null

    val isEven = inputAsInteger % 2 == 0

    println("is Even : ${isEven}")



}