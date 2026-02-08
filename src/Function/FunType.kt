package Function

class FunType {

    // Function type declaration
    val sum : (Int, Int) -> Int = {a,b -> a+b}

    /* Function as variable
    val operation: (Int, Int) -> Int
    operation = { x, y -> x - y }*/

    //nullable function
    val nullableFunc: ((Int) -> String)? = null
}