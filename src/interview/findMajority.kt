package interview

import java.util.*

fun findMajority(arr: IntArray): ArrayList<Int> {
    val n = arr.size
    val res = ArrayList<Int>()

    for (i in 0 until n) {
        // Count the frequency of arr[i]
        var cnt = 0
        for (j in i until n) {
            if (arr[j] == arr[i]) {
                cnt++
            }
        }

        // Check if arr[i] is a majority element
        if (cnt > n / 3) {
            // Add arr[i] only if it is not already present
            if (res.size == 0 || arr[i] != res[0]) {
                res.add(arr[i])
            }
        }

        // If we have found two majority elements, stop searching
        if (res.size == 2) {
            if (res[0] > res[1]) {
                Collections.swap(res, 0, 1)
            }
            break
        }
    }

    return res
}

fun main() {
    val arr = intArrayOf(2, 2, 3, 1, 3, 2, 1, 1)
    val res = findMajority(arr)

    for (ele in res) {
        print("$ele ")
    }
}