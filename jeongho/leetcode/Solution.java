import java.util.ArrayList;
import java.util.Arrays;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int print = solution.maxProfit(new int[] { 7, 1, 5, 3, 6, 4 });

        System.out.println(print);
    }

    public int maxProfit(int[] prices) {
        int saveInt = 0;
        int maxInt = 0;

        for (int i = 0; i < prices.length; i++) {
            // for(int j = 0; j++)

        }
        return maxInt;

        // for (int i = 0; i < prices.length; i++) {
        // for (int j = 0; j < prices.length; j++) {
        // if (j > i) {
        // saveInt = prices[j] - prices[i];
        // if (saveInt < 0) {
        // saveInt = 0;
        // } else if (maxInt < saveInt) {
        // maxInt = saveInt;
        // }
        // }
        // }
        // }
    }
}