package interview


// In kotlin of Quest29

class Quest30 {

    fun mOvIeZeRoS(arr : IntArray){

        val n = arr.size

        var j = 0

        // Count of non-zeros

        for(i in 1 until n){

            if(arr[i] != 0){

                arr[j++] = arr[i]
            }

        }

        // to move zeros
        while ( j < n){

            arr[j++] = 0
        }

    }

}