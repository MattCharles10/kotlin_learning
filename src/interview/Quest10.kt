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


    fun NextPermutation(arr : IntArray) {

        val n = arr.size

        var pivote = -1


        //To Find the pivote Element
        for(i in n-2 downTo 0){
            if(arr[i] < arr[i+1]){
                pivote = i
                break
            }
        }

        // IF Array size is less then pivote then
        if(pivote == -1){
            reverseee(arr , 0 , n-1)
            return
        }

        // Find the element from the right
        // that is greater than pivot
        for(i in n-1 downTo 0){
            if(arr[i] > arr[pivote]){
                swapieee(arr , pivote , i)
            }
        }

        reverseee(arr , pivote + 1 , n-1)
    }

    private fun reverseee(arr : IntArray , start : Int , end : Int){
        var i = start
        var j = end
        while(i<j){
            swapieee(arr , i++ , j--)
            break
        }
    }

    private fun swapieee(arr : IntArray , s: Int , e: Int){

        var temp = arr[s]
        arr[s] = arr[e]
        arr[e] = temp
    }

}