package Arrays.kotlinbaby

import java.util.Arrays

//---------------------------------------------->Time Complexity: O(n*log(n)), as sorting the array takes O(n*log(n)) time and traversing the array can take O(n) time in the worst case, so total time complexity = (n*log(n) + n) = O(n*log(n)).
//Auxiliary space: O(1), as no extra space is required.
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