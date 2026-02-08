package Arrays.kotlinbaby

class rotation2 {

    fun rotateArr(arr : IntArray ,  d : Int){
        val n = arr.size

        var dMod = d % n

        if (dMod == 0) return

        rev(arr , 0 ,dMod-1)

        rev(arr , dMod , n-1)

        rev(arr , 0 , n-1)
    }

    private fun rev(arr : IntArray , start : Int , end: Int){

        while (start < end){

            var i = start
            var j =end

            var temp = arr[start]
            arr[start] = arr[end]
            arr[end] = temp

            i++
            j--


        }
    }




    }
