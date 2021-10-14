class Solution:
    def maxProfit(self, prices: list[int]) -> int:
        # 역배열 접근
        # 다음 최대값이 나올 때까지 최소값을 계속 저장
        # 최대값이 갱신되면 최대-최소를 max_profit과 비교

        max_stock, min_stock = -1, -1
        max_profit = 0
        for i in prices[::-1]:

            if max_stock < i:
                max_profit = max(max_profit, max_stock - min_stock)
                max_stock, min_stock = i, i

            min_stock = min(min_stock, i)

            print(max_stock, min_stock)
        max_profit = max(max_profit, max_stock - min_stock)

        return max_profit


prices =\
    [7, 4, 1, 2]
# [2, 4, 1]

s = Solution()
print(s.maxProfit(prices))
