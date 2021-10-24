package leetcode.week2;

import java.util.Arrays;

// Coin Change
public class LC322 {
    public static int coinChange(int[] coins, int amount) {

        if(amount == 0) {
            return 0;
        }

        int[] dp = new int[amount+1];
        Arrays.fill(dp,amount+1); // dp를 amount+1로 초기화

        dp[0] = 0;

        for(int i = 1; i <= amount; i++) {
            for(int coin : coins) {
                if(coin <= i) {
                    dp[i] = Math.min(dp[i], dp[i - coin] + 1);
                }
            }
        }

        return (dp[amount] == amount + 1) ? -1 : dp[amount];
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 5};
        int result = coinChange(arr, 11);
        System.out.println("result = " + result);
    }
}
