class Solution:
    def lengthOfLIS(self, nums: List[int]) -> int:
        len_nums = len(nums)
        dp = [1] * len_nums

        for i in range(1, len_nums):
            for j in range(i):
                if nums[i] > nums[j]:
                    dp[i] = max(dp[i], dp[j] + 1)

        return max(dp)
