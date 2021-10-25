package leetcode.dp;

public class Q322_CoinChange {
    public static int max = 2147483646; // +1하면 범위를 벗어나서 마이너스 값이 되므로 2^31-2 한 값을 max로 지정
    public static int coinChange(int[] coins, int amount) {
        int[] result = new int[amount + 1];
        result[0] = 0;

        // 최댓값으로 초기화 시켜둔다.
        for (int i = 1; i < result.length; i++) {
            result[i] = max;
        }

        for (int i = 0; i < coins.length; i++) {
            for (int j = coins[i] ; j<result.length ; j++) {
                result[j] = Math.min(result[j],result[j-coins[i]] + 1);
            }
        }

        if(result[amount] >= max)
            result[amount] = -1;

        return result[amount];

    }

    public static void main(String[] args) {
        int[] coins = {2};
        int amount = 3;
        System.out.println(coinChange(coins, amount));
    }

}
