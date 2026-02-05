package Arrays.kotlinbaby

class onepass {
    fun SecArrr(arr : IntArray) : Int{

        var largest = -1
        var secondlargest = -1

        for (i in 0 until arr.size){
            if(arr[i] > largest){
                secondlargest = largest
                largest = arr[i]
            }else if(arr[i] > secondlargest && arr[i] != largest){
                secondlargest = arr[i]
            }
        }
        return secondlargest

        /*Time Complexity: O(n), as we are traversing the array only once.
          Auxiliary space: O(1) */



    }
}