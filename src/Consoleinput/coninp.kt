package Consoleinput

fun coninp(){

   /* println("enter the number : " )

    val input = readln()

    println(input) */

    println("Enter the number : ")

    val input =readln().toInt()

    if(input % 2 ==0)
        println("${input} is  even number .")
    else
    println("${input} is odd number ")

}