class Solution:
    def maxArea(self, height: List[int]) -> int:

        max_value = 0
        
        l, r = 0,len(height) - 1
            
        while l < r:
            
            max_value = max(max_value, min(height[l],height[r]) * (r-l))
            
            if height[l] < height[r]:
                l += 1
            else:
                r -= 1
            
        return max_value
    
        # for i in range(len(height)):
        #     for j in range(i+1,len(height)):
        #         max_value = max(max_value, min(height[i],height[j]) * (j-i))