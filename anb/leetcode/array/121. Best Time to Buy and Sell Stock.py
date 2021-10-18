class Solution(object):
    def maxProfit(self, prices):
        maxi = 0
        ans = 0
        for price in reversed(prices):
            ans = max(ans, maxi - price)
            maxi = max(maxi, price)
        return ans