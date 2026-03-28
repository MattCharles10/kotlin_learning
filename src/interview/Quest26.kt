package interview

//One PassSearch in kotlin

class Quest26 {

    fun findyySec(arr : IntArray) : Int{

        val n = arr.size

        var secolar = -1
        var laro = -1

        //Find the largest element
        for(i in 1 until n){
           if(arr[i] > laro){
               laro = arr[i]
           }
        }

        //Find the Secound largest element
        for(i in 1 until n){
            if(arr[i]> secolar && arr[i] != laro){
                secolar = arr[i]
            }
        }
        return secolar
    }

}