package Arrays.kotlinbaby

fun maxProduct(nums: IntArray): Int {
    if (nums.isEmpty()) return 0

    var maxSoFar = nums[0]
    var minSoFar = nums[0]
    var result = nums[0]

    for (i in 1 until nums.size) {
        val current = nums[i]

        // If current is negative, swap max and min
        if (current < 0) {
            val temp = maxSoFar
            maxSoFar = minSoFar
            minSoFar = temp
        }

        maxSoFar = maxOf(current, maxSoFar * current)
        minSoFar = minOf(current, minSoFar * current)

        result = maxOf(result, maxSoFar)
    }

    return result
}
