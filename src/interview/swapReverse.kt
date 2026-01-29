package interview


fun swapReverse(input: String) : String{

    val charArray = input.toCharArray()

    var start = 0
    var end = charArray.size - 1

    while (start < end){

        val temp = charArray[start]
        charArray[start] = charArray[end]
        charArray[end] = temp

        start++
        end--

    }
    return  String(charArray)
}