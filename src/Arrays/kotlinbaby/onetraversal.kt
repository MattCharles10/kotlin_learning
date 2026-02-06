package Arrays.kotlinbaby

class onetraversal {

    fun pushyzero(arr : IntArray){

        val n = arr.size

        var count = 0

        for(i in 0 until arr.size){

            if(arr[i] != 0){
                var temp = arr[i]
                arr[i] = arr[count]
                arr[count] = temp

                count ++
            }
        }
    }
}