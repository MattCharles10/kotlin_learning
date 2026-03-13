package interview

class Quest12 {

    fun rotated(arr : IntArray , d : Int){



        val n = arr.size

        var d = d % n

        revvvv(arr , 0 , d-1)

        revvvv(arr , d , n-1)

        revvvv(arr , 0 , n-1)


    }

    fun revvvv(arr : IntArray , start : Int , end : Int){



        while ( start < end){

            var s = start

            var e = end

            var temp = arr[start]
            arr[start] = arr[end]
            arr[end]   =  temp

            s++
            e--
        }
    }
}