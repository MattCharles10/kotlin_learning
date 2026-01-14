package list

class Typeinfex() {

    /*type inference allows the compiler to automatically determine a variable's type based on its initial value, making the code concise.
    Explicit type declaration, where the type is written out by the programmer, ensures clarity, prevents accidental type changes, and is recommended for public APIs.
     */

    //create type inference
    val inferednumbers = mutableListOf(1, 2, 3, 4,6,7)


    //Create with explicit type declaration

    val expilictnumber : MutableList<Int> = mutableListOf(12 , 23 , 34 , 45 , 56 ,67)



}