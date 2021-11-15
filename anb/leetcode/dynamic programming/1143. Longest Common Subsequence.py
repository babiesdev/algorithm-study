class Solution(object):
    def rec(self, text1, text2, p1, p2):
        if p1 == len(text1) or p2 == len(text2):
            return 0
        if (p1, p2) in self.dp:
            return self.dp[p1, p2]
        self.dp[p1, p2] = 0
        
        if text1[p1] == text2[p2]:
            self.dp[p1, p2] = self.rec(text1, text2, p1 + 1, p2 + 1) + 1
    
        self.dp[p1, p2] = max(self.dp[p1, p2], self.rec(text1, text2, p1+1, p2), self.rec(text1, text2, p1, p2+1))
        return self.dp[p1, p2]
    
    def longestCommonSubsequence(self, text1, text2):
        """
        :type text1: str
        :type text2: str
        :rtype: int
        """
        self.dp = {}
        return self.rec(text1, text2, 0, 0)