package leetcode.week1;

// Climbing Stairs [lv: easy]
public class LC70 {

    // Dynamic Programming(DP)
    public int climbStairsDP(int n) {
        int[] dp = new int[n+1];
        dp[0] = 1; dp[1] = 1;

        for(int i=2; i <= n; i++) {
            dp[i] = dp[i-1] + dp[i-2];
        }

        return dp[n];
    }

    // 재귀 함수 (시간초과)
    public int climbStairsRecursive(int n) {
        if(n == 1 || n == 2) return n;
        return climbStairsRecursive(n - 1) + climbStairsRecursive(n - 2);
    }
}
