class Solution {
    fun maxProfit(prices: IntArray): Int {
        var max_profit : Int = 0
        var price : Int = prices[0]

        for ((index, value) in prices.withIndex()) {
            if (value < price){
                price = value
                continue
            }

            if (value - price > max_profit){
                max_profit = value - price
            }

        }
        return max_profit
    }
}