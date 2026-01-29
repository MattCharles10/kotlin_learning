package interview

fun RevBuilder(input : String) : String{

    val chars = input.toCharArray()

    val reverse = StringBuilder()

    for(i in chars.size-1 downTo 0){
        reverse.append(chars[i])
    }
    return reverse.toString()
}