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

        var i = start
        var j = end

        while (i < j) {
            val temp = arr[i]
            arr[i] = arr[j]
            arr[j] = temp
            i++
            j--
        }
    }




    }
