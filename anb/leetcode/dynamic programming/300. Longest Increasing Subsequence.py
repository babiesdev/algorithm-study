import bisect
class Solution(object):
    def lengthOfLIS(self, nums):
        """
        :type nums: List[int]
        :rtype: int
        """
        cur = []
        for num in nums:
			pos = bisect.bisect_left(cur, num)
			if pos == len(cur):
				cur.append(num)
			else:
				cur[pos] = num
        return len(cur)