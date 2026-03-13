package interview


//one traversal


class Quest9 {

    fun movezeros(arr : IntArray) {

        var n = arr.size

        var count = 0

        for(i in 1 until n){

            while(arr[i] != 0){

                var temp = arr[i]

                arr[i] = arr[count]

                arr[count] = arr[i]

                count ++ ;
            }
        }
    }
}