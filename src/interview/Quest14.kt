package interview

class Quest14 {

    fun nextPermutation(arr: IntArray) {

        val n = arr.size

        var pivote = -1

        //Find the pivot
        for (i in n - 1 downTo 0) {
            if (arr[i] < arr[i + 1]) {
                pivote = arr[i]
                break
            }
        }

        // if pivote point
        // does not exits revers the whole array
        if (pivote == -1) {
            reverseArr(arr, 0, n - 1)
        }

        //Find the element from the right
        //that is the grater element
        for (i in n - 1 downTo 0) {
            if (arr[i] > arr[pivote]) {
                swapit(arr, i, pivote)
                break
            }
        }

        reversArr(arr, pivote + 1, n - 1)

    }

    private fun swapit(arr: IntArray, i: Int, j: Int) {
        val temp = arr[i]

        arr[i] = arr[j]

        arr[j] = temp
    }

    private fun reversArr(arr: IntArray, start: Int, end: Int) {

        var s = start

        var e = start

        while( s < e){
            swapit(arr , s , e)

            s++
            e--
        }
    }



}