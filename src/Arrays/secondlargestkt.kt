package Arrays

import java.util.Arrays

class secondlargestkt {

    fun SecArr(Str : IntArray) : Int{

        if(Str.size <2) return -1

        Arrays.sort(Str)

        for (i in Str.size-1 downTo 0){
            if(Str[i] != Str[i-1]){
                return Str[i-1]
            }
        }
        return -1

    }
}