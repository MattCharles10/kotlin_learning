package interview

// Array reverse using twopointers

class Quest11 {

    fun reverse(arr : IntArray){

        val n = arr.size

         var  left = 0
         var  right = n-1

        while (left < right){

            var temp = arr[left]

            arr[left] = arr[right]

            arr[right] = temp

            left++

            right--
        }
    }
}