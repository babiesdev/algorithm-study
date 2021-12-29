/*
[문제]
배열 [가격]이 주어지며, 여기서 [가격]은 [i(th)]일에 주어진 주식의 가격이다.

한 주식을 살 "하루"를 선택하고 그 주식을 팔 "미래의 다른 날"을 선택하여 이익을 극대화하려고 합니다.

이 거래로 얻을 수 있는 최대 이익을 돌려주세요. 만약 당신이 어떠한 이익도 얻을 수 없다면, 0을 반환하세요.

Input: prices = [7,1,5,3,6,4]
Output: 5
Explanation: Buy on day 2 (price = 1) and sell on day 5 (price = 6), profit = 6-1 = 5.
Note that buying on day 2 and selling on day 1 is not allowed because you must buy before you sell.


[7,6,4,3,1]
0
[1,2,4]
3
[1,2]
2

 */
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
