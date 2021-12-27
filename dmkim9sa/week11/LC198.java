package leetcode.week11;

import java.util.Arrays;

/**
 *  House Robber
 *  점화식: 최대값 = max(이전값, 현재값 + 이이전값)
 */
public class LC198 {

    public static void main(String[] args) {
        int solution = rob(new int[]{4, 1, 2, 7, 5, 3, 1});
        System.out.println("solution = " + solution);
        /* int solution2 = rob2(new int[]{4, 1, 2, 7, 5, 3, 1});
        System.out.println("solution2 = " + solution2);*/
    }

    /**
     * 다른 사람 풀이
     */
    public static int rob2(int[] nums) {

        if (nums.length == 0) return 0;
        if (nums.length == 1) return nums[0];

        nums[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < nums.length; i++) {
            nums[i] = Math.max(nums[i - 1], nums[i - 2] + nums[i]);
        }

        return nums[nums.length - 1];
    }

    /**
     * 내 풀이
     */
    public static int rob(int[] nums) {

        if(nums.length == 1) return nums[0];
        if(nums.length == 2) return Math.max(nums[0], nums[1]);

        int[] dp = new int[nums.length];
        dp[0] = nums[0];
        dp[1] = nums[1];

        int max = Math.max(dp[0], dp[1]);
        for (int i = 2; i < nums.length; i++) {
            for(int j = 0; j <= i - 2; j++) {
                max = Math.max(max, nums[i] + dp[j]);
                dp[i] = max;
            }
        }
        return max;
    }
}
