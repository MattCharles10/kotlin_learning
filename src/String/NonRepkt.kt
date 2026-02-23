package String

class NonRepkt {

    fun firstNonRepeatingChar(str : String) : Char ?{

        val MAX_CHAR = 256

        val index = IntArray(MAX_CHAR){ -1 }

        for( i in str.indices){
            val  ascii = str[i].code

            if(index[ascii] == -1){
                index[ascii] = i
            }else{
                index[ascii] = -2
            }
        }
        var result  = Int.MAX_VALUE

        for(i in 0 until MAX_CHAR){
            if(index[i] >= 0){
                result = minOf(result , index[i])
            }
        }
        return if(result == Int.MAX_VALUE) null else str[result]
    }


}