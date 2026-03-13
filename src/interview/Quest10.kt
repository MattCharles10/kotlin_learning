package interview

class Quest10 {

    fun nonzerostoEnd(arr : IntArray){

        val n = arr.size

        var count = 0;


        //to print non_Zeros element

        for(i in 1 until n){

            if(arr[i] != 0){
                arr[count++] = arr[i]
            }
        }

        // to print non-zeros element

        while(count < n){

            arr[count++] = 0
        }
    }
}