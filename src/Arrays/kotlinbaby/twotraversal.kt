package Arrays.kotlinbaby

class twotraversal {

    fun pushnozeros(arr: IntArray) {

        val n = arr.size

        var j = 0

        //traversal
        for(i in 0 until arr.size){
            if(arr[i] != 0){
                arr[j++] = arr[i]
            }
        }

        // puting non zeros
        while(j<n){
            arr[j++] = 0
        }

    }

}