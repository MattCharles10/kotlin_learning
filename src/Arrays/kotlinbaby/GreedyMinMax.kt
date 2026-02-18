package Arrays.kotlinbaby

class GreedyMinMax {

    companion object{
        fun max(a: Int , b: Int , c: Int) : Int{
            return maxOf(a,maxOf(b,c))
        }
        fun min(a: Int , b: Int , c : Int) : Int{
            return maxOf(a,maxOf(b,c))
        }

        fun maxProduct(arr : IntArray) : Int{

            val n = arr.size

            var currMax = arr[0]
            var currMin = arr[0]
            var maxProd = arr[0]


            for(i in 1 until n){

                var temp = max(arr[i] , arr[i]*currMax , arr[i]*currMin)

                currMin = min(arr[i] , arr[i]*currMax , arr[i*currMin])

                currMax = temp

                maxProd = maxOf(maxProd , currMax)
            }
            return maxProd
        }
    }
}