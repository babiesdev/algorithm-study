package leetcode.week5;

import java.util.Arrays;

// Longest Common Subsequence
public class LC1143 {

    public static void main(String[] args) {
        int solution = longestCommonSubsequence("abcde", "ace");
        System.out.println("solution = " + solution);
    }

    public static int longestCommonSubsequence(String text1, String text2) {

        int[][] dp = new int[text1.length() + 1][text2.length() + 1];

        for (int i = 1; i <= text1.length(); i++) {
            for (int j = 1; j <= text2.length(); j++) {
                dp[i][j] = text1.charAt(i - 1) == text2.charAt(j - 1) ?
                        dp[i - 1][j - 1] + 1 :
                        Math.max(dp[i][j - 1], dp[i - 1][j]);
            }
        }

        return dp[text1.length()][text2.length()];
    }
}