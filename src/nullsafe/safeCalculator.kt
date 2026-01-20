package nullsafe

fun safeCalculator(){

    println("Enter the first number :")

    val num1 = readlnOrNull()?.toIntOrNull()

    println("Enter the Second number : ")

    val num2 = readlnOrNull()?.toIntOrNull()

    println("Enter operation (+, -, *, /):")
    val operation = readlnOrNull()

    if (num1 == null || num2 == null) {
        println("Invalid numbers entered!")
        return
    }

    val result = when (operation) {
        "+" -> num1 + num2
        "-" -> num1 - num2
        "*" -> num1 * num2
        "/" -> if (num2 != 0) num1 / num2 else "Cannot divide by zero"
        else -> "Invalid operation"
    }

    println("Result: $result")
}