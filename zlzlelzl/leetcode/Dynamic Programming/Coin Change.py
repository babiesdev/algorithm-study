import sys


class Solution:
    def coinChange(self, coins: List[int], amount: int) -> int:
        dp = [sys.maxsize] * 10001

        if amount == 0:
            return 0

        for i in range(1, amount+1):
            for j in coins:
                if i == j:
                    dp[j] = 1
                elif i > j:
                    dp[i] = min(dp[i], dp[i-j] + 1)

        if dp[amount] == sys.maxsize:
            return -1

        return dp[amount]
