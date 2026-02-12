package Arrays.kotlinbaby

class GfG2 {

    fun findele(arr : IntArray){

        val n = arr.size

        var smallest = Integer.MAX_VALUE
        var largest = Integer.MIN_VALUE
        var secoundlargest = Integer.MIN_VALUE

        for(i in 0 until arr.size) {
            if(arr[i]>largest){
                secoundlargest = largest
                largest = arr[i]
            }
            else if(arr[i] > secoundlargest && arr[i] != largest){
                secoundlargest = arr[i]
            }
            if (arr[i] < smallest){
                smallest = arr[i]
            }
        }
        println("Smallest : $smallest" )
        println("Largest :  $largest")
        println("Secoundlargest : $secoundlargest")
    }
}