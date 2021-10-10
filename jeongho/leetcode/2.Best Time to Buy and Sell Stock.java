import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int print = solution.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 });

        System.out.println(print);
    }

    public int maxProfit(int[] prices) {
        int minInt = Integer.MAX_VALUE;
        int maxInt = 0;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minInt) {
                minInt = prices[i];
            } else if (prices[i] - minInt > maxInt) {
                maxInt = prices[i] - minInt;
            }
        }
        return maxInt;
    }
}