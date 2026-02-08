package Function

class FunDecalartion {

    // Function with parameters and return type
    fun add ( a : Int , b : Int) : Int{
        return a + b
    }

    // Single-expression function (type inference)
    fun multply( x : Int , y : Int) = x * y

    // Function with default parameters
    fun greet(name : String = "mathew " , greeting : String = "Hello"){
        print("$greeting $name  welcome")
    }

    // Unit return type (void equivalent)
   /* fun printmsg(messages : String) : UInt{
        print(messages)
    } */

}