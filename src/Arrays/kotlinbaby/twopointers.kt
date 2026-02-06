package Arrays.kotlinbaby

class twopointers {

    fun reverse(arr : IntArray){

        val n = arr.size

        var left = 0 ;
        var right = arr.size-1

        while(left < right){
            var temp = arr[left]
            arr[left] = arr[right]
            arr[right] = temp

            left++
            right--

        }
    }
}