package interview




class Quest24 {

    fun MaxSubArray(arr : IntArray) : Int {

        var res = arr [0]

        var maxending = arr[0]

        for(i in 1 until arr.size){

            maxending = maxOf(maxending + arr[i], arr[i])

            res = maxOf(res , maxending)
        }

        return  res
    }

}