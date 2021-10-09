package leetcode.warmup;

// Best Time to Buy and Sell Stock [level : easy]
public class LC121 {

    public int maxProfit(int[] prices) {

        int maxPrice = 0; // 최대 이익
        int minStock = prices[0]; // 최저 주가

        for (int i = 1; i < prices.length; i++) {
            int profit = prices[i] - minStock; // 수익
            if(profit > maxPrice) {
                maxPrice = profit;
            }

            if(prices[i] < minStock) {
                minStock = prices[i];
            }
            // System.out.println("sum = " + profit + ", minStock = " + minStock + ", maxPrice = " + maxPrice);
        }
        return maxPrice;
    }
}
