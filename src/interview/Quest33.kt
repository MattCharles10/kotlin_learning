package interview

import com.sun.tools.javac.Main

class Quest33 {

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