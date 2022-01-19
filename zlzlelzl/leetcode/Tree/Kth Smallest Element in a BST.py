import heapq

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def kthSmallest(self, root: Optional[TreeNode], k: int) -> int:
        q = []
        
        def dfs(now):
            if not now:
                return
            
            heapq.heappush(q, now.val)
            
            dfs(now.left)
            dfs(now.right)
            
        dfs(root)
        
        for i in range(k):
            min_value = heapq.heappop(q)
        
        return min_value
            