class Solution(object):
    def climbStairs(self, n):
        a, b, c, = 0, 1, 0
        
        for i in range(0, n):
            c = a + b
            a, b, c = b, c, 0
        return b
            
        