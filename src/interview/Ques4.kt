package interview

/*Given an array of integers arr[], move all the zeros to the end of the array while maintaining the relative order of all non-zero elements.

Examples:

Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three 0s that are moved to the end.

Input: arr[] = [10, 20, 30]
Output: [10, 20, 30]
Explanation: No change in array as there are no 0s.

Input: arr[] = [0, 0]
Output: [0, 0]
Explanation: No change in array as there are all 0s. */


class Ques4 {

    fun pushzeros(arr : IntArray){

        val n = arr.size

        var temp = IntArray(n)

        var j =0

        for(i in 0 until n){
            if(arr[i] != 0){
                temp[j++] = arr[i]
            }
        }

        while(j<n){
            temp[j++] = 0
        }

        for(i in 1..n){
            arr[i] = temp[i]
        }

    }

    fun FuzzBuzz(n : Int){

        for(i in 1 .. n){

            when{
                i % 15 == 0 -> println("FizzBuzz")
                i % 3 == 0 -> println("Fizz")
                i % 5 == 0 -> println("Buzz")
                else -> println(i)
            }
        }
    }

}