class Solution:
    def rob(self, nums: List[int]) -> int:
        if len(nums) <= 3:
            return max(nums)

        def list_calc(nums_part):
            dp = [0] * len(nums_part)

            dp[0] = nums_part[0]
            dp[1] = max(nums_part[0:2])

            for i in range(2, len(nums_part)):
                dp[i] = max(dp[i-1], dp[i-2] + nums_part[i])

            return dp[-1]
        return max(list_calc(nums[1:]), list_calc(nums[:-1]))
