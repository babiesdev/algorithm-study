class Solution(object):
    def countBits(self, n):
        """
        :type n: int
        :rtype: List[int]
        """
        ans = []
        ans.append(0)
        
        for i in range(1, n+1):
            for j in range(25, -1, -1):
                if (i & (1 << j)) > 0:
                    ans.append(ans[i ^ (1 << j)] + 1)
                    break
        return ans