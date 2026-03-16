package interview

class Quest15 {

    fun findMajority(arr: IntArray): List<Int> {
        var candidate1: Int? = null
        var candidate2: Int? = null
        var count1 = 0
        var count2 = 0

        // Step 1: Find potential candidates
        for (num in arr) {
            when {
                candidate1 == num -> count1++
                candidate2 == num -> count2++
                count1 == 0 -> {
                    candidate1 = num
                    count1 = 1
                }
                count2 == 0 -> {
                    candidate2 = num
                    count2 = 1
                }
                else -> {
                    count1--
                    count2--
                }
            }
        }

        // Step 2: Verify candidates
        count1 = 0
        count2 = 0

        for (num in arr) {
            if (num == candidate1) count1++
            else if (num == candidate2) count2++
        }

        val result = mutableListOf<Int>()
        val n = arr.size

        if (count1 > n / 3) result.add(candidate1!!)
        if (count2 > n / 3) result.add(candidate2!!)

        return result
    }




}