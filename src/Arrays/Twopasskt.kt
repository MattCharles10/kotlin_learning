package Arrays

class Twopasskt {

    fun SecArrkt(arr : IntArray) : Int
    {
        val n = arr.size
        var largest  = -1
        var secondlarge = -1

        //finding largest arr
        for(i in n until  0){
            if(arr[i] > largest){
                largest = arr[i]
            }
        }

        //finding Secondlargest arr
        for(i in n until 0){
            if(arr[i] > secondlarge && arr[i] != largest){
                secondlarge = arr[i]
            }
        }
        return secondlarge
    }
}