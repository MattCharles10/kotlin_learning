package Sort

class CinA {
    fun countAndMerge(arr: IntArray, l: Int, m: Int, r: Int): Int {

        val n1 = m - l + 1
        val n2 = r - m

        val left = IntArray(n1)
        val right = IntArray(n2)

        for (i in 0 until n1)
            left[i] = arr[l + i]

        for (j in 0 until n2)
            right[j] = arr[m + 1 + j]

        var res = 0
        var i = 0
        var j = 0
        var k = l

        while (i < n1 && j < n2) {
            if (left[i] <= right[j]) {
                arr[k++] = left[i++]
            } else {
                arr[k++] = right[j++]
                res += (n1 - i)
            }
        }

        while (i < n1) {
            arr[k++] = left[i++]
        }

        while (j < n2) {
            arr[k++] = right[j++]
        }

        return res
    }

    fun countInv(arr: IntArray, l: Int, r: Int): Int {
        var res = 0
        if (l < r) {
            val m = (l + r) / 2

            res += countInv(arr, l, m)
            res += countInv(arr, m + 1, r)
            res += countAndMerge(arr, l, m, r)
        }
        return res
    }

    fun inversionCount(arr: IntArray): Int {
        return countInv(arr, 0, arr.size - 1)
    }
}