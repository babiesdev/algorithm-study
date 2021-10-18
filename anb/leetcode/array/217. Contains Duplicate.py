class Solution(object):
    def containsDuplicate(self, nums):
        used = set()
        for num in nums:
            if num in used:
                return True
            used.add(num)
        return False
        