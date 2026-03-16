package interview

/*Input: nums = [2,7,11,15], target = 9
Output: [0,1] */

class Quest16 {

    fun twoSum(nums : IntArray , target : Int) : IntArray{
        val map = HashMap<Int , Int>()

        for(i in nums.indices){
            val complement = target - nums[i]

            if(map.containsKey(complement)){
                return intArrayOf(map[complement]!! , i)
            }

            map[nums[i]] = i
        }

        return intArrayOf()
    }
}