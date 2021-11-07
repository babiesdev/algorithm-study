class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxSubArray(new int[] { -2, 1, -3, 4, -1, 2, 1, -5, 4 }));
    }
}

class Solution {
    public int maxSubArray(int[] nums) {
        int maxValue = nums[0];
        int prevValue = nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (prevValue + nums[i] > nums[i]) {
                prevValue += nums[i];
            } else {
                prevValue = nums[i];
            }
            if (prevValue > maxValue) {
                maxValue = prevValue;
            }
        }
        return maxValue;
    }
}