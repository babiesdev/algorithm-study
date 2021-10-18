class Solution121 {
    public int maxProfit(int[] prices) {
        if (prices.length < 2)
            return 0;
        int buy = prices[0];
        int answer = 0;
        for (int i = 1; i < prices.length; i++) {
            if (buy > prices[i]) buy = prices[i];
            else answer = Math.max(answer, prices[i] - buy);
        }
        return answer;
    }
}