class Solution:
    def combinationSum4(self, nums: List[int], target: int) -> int:
        dp = [0] * (target+1)

        for i in nums:
            if i <= target:
                dp[i] = 1

        for i in range(1, target+1):
            for j in nums:
                if i > j:
                    dp[i] += dp[i-j]

        return dp[target]
