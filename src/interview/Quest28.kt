package interview


/*

Input: arr[] = [12, 35, 1, 10, 34, 1]

Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.

Input: arr[] = [10, 5, 10]
Output: 5
Explanation: The largest element of the array is 10 and the second largest element is 5.

Input: arr[] = [10, 10, 10]
Output: -1
Explanation: The largest element of the array is 10 there is no second largest element.

 */


class Quest28 {

    fun  OnePass(arr : IntArray) : Int {

        val n = arr.size ;

        var seccro  =  -1
        var larro   =  -1

        for(i in 1 until  n){

             if(arr[i] > larro){
                 seccro = larro
                 larro = arr[i]
             }
            else if (arr[i] < larro && arr[i] > seccro){
                seccro = arr[i]
             }

        }
        return seccro
    }
}