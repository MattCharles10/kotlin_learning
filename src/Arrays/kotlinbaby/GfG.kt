package Arrays.kotlinbaby

class GfG{

    companion object {

        fun pushzeroS(int: IntArray) {

            val n = int.size
            var temp = IntArray(n)
            var j=0

            //copy non-zero array elements

            for(i in 0 until n){
                if(int[i] != 0){
                    temp[j++] = int[i]
                }
            }

            // remaining non-zeros

            while (j<n){
                temp[j++] = 0
            }

            //copy to
            for(i in 0 until n){
                int[i] = temp[i]
            }

        }
    }
}