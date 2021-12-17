class Solution:
    def findMin(self, nums: List[int]) -> int:
        l, r = 0, len(nums) - 1

        if nums[l] <= nums[r]:
            return nums[l]

        while r - l != 1:
            mid = (l + r) // 2
            if nums[mid] > nums[r]:
                l = mid
            elif nums[l] > nums[mid]:
                r = mid

        return nums[r]
