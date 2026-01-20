package list.problems

fun twoSum(nums: List<Int>, target: Int): List<Int> {
    val map = mutableMapOf<Int, Int>()

    for ((index, num) in nums.withIndex()) {
        val complement = target - num

        if (map.containsKey(complement)) {
            return listOf(map[complement]!!, index)
        }

        map[num] = index
    }

    return emptyList()
}