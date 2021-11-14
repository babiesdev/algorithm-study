package leetcode.week4;

// Maximum Subarray
public class LC53 {

    public static void main(String[] args) {
        int result = maxSubArray(new int[]{5,4,-1,7,8});
        System.out.println("result = " + result);
    }

    public static int maxSubArray(int[] nums) {

        int max = nums[0];

        for (int i = 1; i < nums.length; i++) {
            nums[i] = Math.max(nums[i], nums[i] + nums[i - 1]);
            max = Math.max(max, nums[i]);
        }

        return max;
    }
}
