package interview

class Quest6 {

    fun removeDuplicate(arr : IntArray) : Int{

        val n = arr.size

        if(n <= 1){
            return n
        }

        var idx = 1

        for(i in 1 until n){

            if(arr[i] != arr[i-1]){
                arr[idx++] = arr[i]
            }
        }

        return idx

    }
}