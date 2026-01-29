package interview

fun Ques3(input : String) : String{


    /* val name = "Mathew"
     val rev = name.reversed()
                                 ---------------- > Built-in reversed() Function
     println("Original $name")
     println("Reversed  $rev")*/

    //manualReverse

    val charArray = input.toCharArray()
    var rev = " "

    for( i in charArray.size-1 downTo 0){
        rev = rev + charArray[i]
    }
    return rev

}