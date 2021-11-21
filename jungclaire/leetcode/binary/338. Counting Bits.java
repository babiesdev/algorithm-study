class Solution {
    public int[] countBits(int n) {
        int[] dp = new int[n + 1];

        for (int i = 1; i < dp.length; i++) {
            dp[i] = dp[i & (i - 1)] + 1;
        }

        return dp;
    }
}