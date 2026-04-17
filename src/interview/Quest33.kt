package interview

import com.sun.tools.javac.Main

class Quest33 {


    fun findMAjority(arr : IntArray) : IntArray{     ///

        var ele1  = -1
        var ele2  = -1
        var cnt1 = 0
        var cnt2 = 0

        for( ele in arr){

            if(ele1 == ele){
                cnt1++;
            }else if(ele2 == ele){
                cnt2++;
            }else if(cnt1 == 0){
                ele1 = ele
                cnt1 = 1
            }else if (cnt2 == 0){
                ele2 = ele
                cnt2 = 1
            }
            else{
                cnt1--
                cnt2--
            }
        }

        cnt1 = 0
        cnt2 = 0

        for(ele in arr){
            if(ele == ele1) cnt1++
            if(ele == ele2)  cnt2++
        }

        val n = arr.size
        val result = mutableListOf<Int>()  // In java we uses ArrayList<Integer> res = new ArrayList<>() ;

        if ( cnt1> n /3 ) result.add(ele1)
        if ( cnt2 > n/3 ) result.add(ele2)

        return result.toIntArray()


    }


    fun ArrRevv(arr : IntArray){

        val n = arr.size

        var left = 0
        var right = n -1

        while(left < right){
            var temp = arr[left]
            arr[left] = arr[right]
            arr[right] = temp

            left ++
            right--
        }
    }

    fun Main(){
        val arr = intArrayOf(1, 4, 3, 2, 6, 5)

        ArrRevv(arr)

        for (i in arr) {
            print("$i ")
        }
    }
}