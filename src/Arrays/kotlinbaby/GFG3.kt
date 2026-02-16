package Arrays.kotlinbaby

import nullsafe.comparisonExample
import kotlin.math.min

class GFG3 {

    fun  getMinDiff(arr : IntArray , k : Int) : Int {

        val n = arr.size

        arr.sort()

        var res = arr[n-1] - arr[0];

        for( i in 1 until n){

            if(arr[i] - k < 0){
                continue
            }

            val minH = minOf(arr[0]+k , arr[i]-k)
            val maxH = maxOf(arr[i-1]+k , arr[n-1]-k)

            res = minOf(res , maxH -minH)
        }
        return res
    }
}