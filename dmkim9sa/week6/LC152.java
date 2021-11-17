package leetcode.week6;

// Maximum Product Subarray
public class LC152 {

    public static void main(String[] args) {
        int solution = maxProduct(new int[]{2,3,-2,4});
        System.out.println("solution = " + solution);
    }

    public static int maxProduct(int[] nums) {

        int max = nums[0];
        int min = nums[0];
        int result = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int currMax = Math.max(max * nums[i], Math.max(nums[i], min * nums[i]));
            int currMin = Math.min(max * nums[i], Math.min(nums[i], min * nums[i]));

            max = currMax;
            min = currMin;

            result = Math.max(max, result);
            System.out.println("max = " + max);
            System.out.println("min = " + min);
        }

        return result;
    }
}
