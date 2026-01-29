package interview

import java.io.DataInput

fun swapReverse(input: String) : String{

    val charArray  = input.toCharArray()

    val rev = StringBuilder()

    for(i in charArray.size-1 downTo 0){
        rev.append(charArray[i])
    }

    return rev.toString()
}