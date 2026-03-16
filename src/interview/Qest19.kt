package interview

class Qest19 {

    fun checkEvenOdd(num : Int) : String{
        return if (num % 2 == 0) "Even" else "Odd"
    }

    fun findlargest(arr : IntArray) : Int {
        var max = arr[0]
        for(i in 1 until arr.size){
            if(arr[i] > max){
                max = arr[i]
            }
        }
        return  max
    }

}