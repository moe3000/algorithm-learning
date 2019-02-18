package feb

fun twoSum(nums: IntArray, target: Int): IntArray {
    val resArray = IntArray(2)
    val usedMap = hashMapOf<Int, Int>()

    for (i in nums.indices) {
        if (usedMap.containsKey(target - nums[i])) {
            resArray[1] = i
            resArray[0] = usedMap[target - nums[i]]!!
            return resArray
        } else {
            usedMap[nums[i]] = i
        }
    }
    return resArray
}