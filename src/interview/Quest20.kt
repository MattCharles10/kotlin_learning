package interview

class Quest20 {

    fun nextPermutation( arr : IntArray ) {

        val n = arr.size

        //Find pivote
        var pivote = -1
        for(i in n-2 downTo 0){
            if(arr[i] > arr[i+1]){
                pivote = arr[i]
                break
            }
        }

        //edge case
        if(pivote == -1){
            arr.reversed()
        }

        // swap
        for(i in n-1 downTo 0){
            if(arr[i] > arr[pivote]){
                arr.swap(i, pivote)
            }
        }

        arr.reverse(pivote+1 , n-1)

    }

    fun IntArray.reverse(start: Int, end: Int) {
        var s = start
        var e = end
        while (s < e) {
            swap(s++, e--)
        }
    }

    // Extension function to swap two elements
    fun IntArray.swap(i: Int, j: Int) {
        val temp = this[i]
        this[i] = this[j]
        this[j] = temp
    }
}