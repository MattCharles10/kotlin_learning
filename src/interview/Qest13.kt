package interview

// Next Permutation

class Qest13 {

    fun rotated2(arr : IntArray , d : Int) : IntArray{

        val n = arr.size

        val k = d%n

        revvv( arr , 0 , d-1 )

        revvv( arr , d , n-1 )

        revvv( arr , 0 , n-1 )

        return arr
    }

    fun revvv (arr : IntArray , start : Int , end : Int){



       while(start < end) {
           var  s = start

           var  r = end

           var temp = arr[start]

           arr[start] = arr[end]

           arr[end]  =  temp

           s++
           r--
       }
    }


}