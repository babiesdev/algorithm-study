class Solution {
    public int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;
        int max = 0;

        for(int i = 0; i < prices.length; i++) {
            if(prices[i] < min) {
                min = prices[i];
            } else if(prices[i] - min > max) {
                max = prices[i] - min;
            }
        }
        return max;
    }
}
class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxProfit(new int[]{7,1,5,3,6,4}));
    }
}