package Arrays.kotlinbaby

class MissingNum {

    companion object{
        fun missingNum(arr : IntArray): Int{

            val n = arr.size

            for(i in 0 until n){
                while(arr[i] >= 1 && arr[i] <= n && arr[i] != arr[arr[i]-1]){

                    // then swap arr[i] and arr[arr[i]-1] to
                    // place arr[i] to its corresponding index
                    var temp = arr[i]
                    arr[i] = arr[arr[i]-1]
                    arr[temp-1] = temp
                }
            }

            for(i in 1 until  n){
                if(i != arr[i-1]){
                    return  i ;
                }
            }

            return  n+1;

        }

    }
}