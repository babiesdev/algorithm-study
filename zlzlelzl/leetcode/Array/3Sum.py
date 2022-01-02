class Solution:
    def threeSum(self, nums: List[int]) -> List[List[int]]:
        if len(nums) < 3:
            return []

        nums.sort()

        li = []

        for i in range(len(nums) - 2):
            l, r = i + 1, len(nums) - 1

            while l < r:
                temp_sum = nums[i] + nums[l] + nums[r]

                if temp_sum == 0:
                    if [nums[i], nums[l], nums[r]] not in li:
                        li.append([nums[i], nums[l], nums[r]])
                    r -= 1
                    l += 1

                elif temp_sum > 0:
                    r -= 1
                else:
                    l += 1

        return li
