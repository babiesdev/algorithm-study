package leetcode.week7;

// Combination Sum IV

import java.util.Arrays;

/**
 *  배열 요소를 이용해서 target 넘버를 만들 수 있는 조합의 개수르 반환
 */
public class LC377 {

    public static void main(String[] args) {
        int solution = combinationSum4(new int[]{9}, 3);
        System.out.println("solution = " + solution);
    }

    public static int combinationSum4(int[] nums, int target) {

        if(nums == null || nums.length == 0) {
            return 0;
        }

        // 주어진 숫자들로 target + 1을 만드는 경우의 수
        int[] dp = new int[target + 1];
        dp[0] = 1;

        for (int i = 0; i < dp.length; i++) {
            for (int num : nums) {
                if (i - num >= 0) {
                    dp[i] += dp[i - num];
                }
            }
        }

        return dp[target];
    }
}
