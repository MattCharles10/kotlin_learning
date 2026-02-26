fun kthSmallest(a: IntArray, b: IntArray, k: Int): Int {
    val n = a.size
    val m = b.size
    var lo = 0
    var hi = n
    var idx = 0

    while (lo <= hi) {
        val mid1 = (lo + hi) / 2
        val mid2 = k - mid1

        // If mid2 is out of bounds for b[]
        if (mid2 > m) {
            lo = mid1 + 1
            continue
        }

        val l1 = if (mid1 == 0) Int.MIN_VALUE else a[mid1 - 1]
        val r1 = if (mid1 == n) Int.MAX_VALUE else a[mid1]

        val l2 = if (mid2 == 0) Int.MIN_VALUE else b[mid2 - 1]
        val r2 = if (mid2 == m) Int.MAX_VALUE else b[mid2]

        if (l1 <= r2 && l2 <= r1) {
            idx = mid1
            break
        }

        if (l1 > r2) {
            hi = mid1 - 1
        } else {
            lo = mid1 + 1
        }
    }

    return idx
}

fun mergeArrays(a: IntArray, b: IntArray) {
    val n = a.size
    val idx = kthSmallest(a, b, n)

    for (i in idx until n) {
        val temp = a[i]
        a[i] = b[i - idx]
        b[i - idx] = temp
    }

    a.sort()
    b.sort()
}