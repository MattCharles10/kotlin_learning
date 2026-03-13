package interview


//one parse Search
class Ques8 {

    fun findSecodlargest(arr : IntArray) : Int{

        val n = arr.size

        var largest = -1
        var secoundlargest = -1

        for(i in 1 until n){

            if(arr[i] > largest){
                secoundlargest = arr[i];
                largest = secoundlargest;
            }

            else if(arr[i] < largest  && arr[i] > secoundlargest){
                secoundlargest = arr[i]
            }
        }

        return secoundlargest

    }

}