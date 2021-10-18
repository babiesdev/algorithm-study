def maxProfit(prices) -> int:
        lm = 10001
        m = 0
        for i in range(len(prices)):
            if prices[i] < lm: lm = prices[i]
            if prices[i] - lm > m: m = prices[i] - lm
        return m

print(maxProfit([7,1,5,3,6,4]))