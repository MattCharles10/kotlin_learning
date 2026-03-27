package interview

class Quest22 {

    fun MaxSubbyArr(arr : IntArray) : Int{

        var res = arr[0];
        var currSum = arr[0]

        for(i in 1 until arr.size){


            currSum = currSum + arr[i]

            res = maxOf(currSum  , res)
        }
        return res
    }


}