package Function

import jdk.dynalink.Operation

class FunType {

    // Function type declaration
    val sum : (Int, Int) -> Int = {a,b -> a+b}

    /* Function as variable
    val operation: (Int, Int) -> Int
    operation = { x, y -> x - y }*/

    //nullable function
    val nullableFunc: ((Int) -> String)? = null

    //Higher-Order Functions
    //Functions that take functions as parameters or return functions.

    fun Calulate(a : Int , b : Int , operation:(Int , Int) -> Int) : Int{
        return operation(a,b)
    }

    fun getMultiplyer( factor : Int) : (Int) -> Int{
        return {number -> number * factor}
    }
}