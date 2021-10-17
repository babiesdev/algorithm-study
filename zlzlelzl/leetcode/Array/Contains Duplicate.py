from collections import Counter


class Solution:
    def containsDuplicate(self, nums: list[int]) -> bool:
        return any(filter(lambda x: x > 1, Counter(nums).values()))
