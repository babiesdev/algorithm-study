class Solution {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        nums.forEachIndexed{ index, value ->
            var num: Int = target - value
            var numIndex: Int = nums.indexOf(num)
            if(numIndex!=-1 && numIndex != index) {
                return intArrayOf(index,numIndex)
            }
        }
        return IntArray(2)
    }
}
