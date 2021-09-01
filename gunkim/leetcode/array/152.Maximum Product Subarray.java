public class Main {
    public static void main(String[] args) {
        int[] testArr = {0,2};
        Solution solution = new Solution();
        System.out.println(solution.maxProduct(testArr));
    }
}
class Solution {
    public int maxProduct(int[] nums) {
        if(nums.length == 1) {
            return nums[0];
        }
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < nums.length; i++) {
            if(nums[i] == 0) continue;
            if(nums[i] > max) max = nums[i];

            int currentMax = nums[i];
            for(int j = (i+1); j < nums.length; j++) {
                currentMax *= nums[j];

                if(currentMax > max) {
                    max = currentMax;
                }
            }
            if(nums[nums.length - 1] > max) max = nums[nums.length - 1];
        }
        return max;
    }
}