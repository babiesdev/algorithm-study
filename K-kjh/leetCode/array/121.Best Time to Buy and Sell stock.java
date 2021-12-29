public class Main {
    public static void main(String[] args){
        Solution so = new Solution();
        int[] nums = {7,1,5,3,6,4};
       System.out.println(so.maxProfit(nums));
        nums = new int[]{7,6,4,3,1};
        System.out.println(so.maxProfit(nums));
        nums = new int[]{1,2,4};
        System.out.println(so.maxProfit(nums));
        nums = new int[]{1,2};
        System.out.println(so.maxProfit(nums));

    }
}
class Solution {
    int max = 0;
    public int maxProfit(int[] prices) {
        max=0;
        for( int i=0;i<prices.length-1;i++){
            for(int j=i+1;j<prices.length;j++){
                if(prices[i] < prices[j] && prices[j] - prices[i] > max ){
                    max = j+1;
                }
            }
        }
        return max;
    }
}
