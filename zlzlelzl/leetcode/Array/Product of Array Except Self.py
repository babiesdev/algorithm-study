class Solution:
    def productExceptSelf(self, nums: List[int]) -> List[int]:

        len_nums = len(nums)

        li = [1] * len_nums

        # prefix
        for i in range(1, len_nums):
            li[i] = nums[i-1] * li[i-1]

        # suffix
        for i in range(1, len_nums)[::-1]:
            nums[i-1] = nums[i-1] * nums[i]

        for i in range(len_nums-1):
            li[i] = li[i] * nums[i+1]

        return li
