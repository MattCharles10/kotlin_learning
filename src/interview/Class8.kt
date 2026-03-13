package interview

class Class8 {

    fun zerostoEnd(arr : IntArray){

        val n = arr.size

        var temp = IntArray(n)

        var j = 0

        //copy non-zeros element

        for(i in 1 until n){
            if(arr[i] != 0){
                temp[j++] = arr[i]
            }
        }

        while (j<n){

            temp[j++] = 0
        }

        for (i in 1 until n){
            arr[i] = temp[i]
        }
    }
}