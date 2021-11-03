class Solution:
    def maxSubArray(self, nums: List[int]) -> int:
        maxi = -100000000
        ans = 0
        cur = 0
        neg = True
        
        for num in nums:
            neg = neg and num < 0
            
            maxi = max(maxi, num)
            cur = max(num, cur + num)
            ans = max(ans, cur)
        
        if neg:
            return maxi
        else:
            return ans
        