package leetcode.week3;

import java.util.Arrays;

// Longest Increasing Subsequence
// LIS(최장 증가 수열): 어떤 수열이 주어졌을 때 최장으로 증가하는 부분 수열
public class LC300 {

    public static void main(String[] args) {
        int result = lengthOfLIS(new int[] {10,9,2,5,3,7,101,18});
        System.out.println("result = " + result);
    }

    public static int lengthOfLIS(int[] nums) {

        int[] dp = new int[nums.length];
        dp[0] = 1;

        int max = 1;
        for (int i = 1; i < dp.length; i++) {
            dp[i] = 1; // 초기에는 i번째의 최장길이를 1로 초기화 (뒤에 더 큰 수가 없을수도 있기 때문에)
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j] && dp[j] + 1 > dp[i]) {
                    dp[i] = dp[j] + 1;
                    max = Math.max(max, dp[i]);
                }
            }
        }
        System.out.println(Arrays.toString(dp));
        return max;
    }
}
