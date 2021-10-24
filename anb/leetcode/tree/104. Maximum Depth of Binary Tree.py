# Definition for a binary tree node.
# class TreeNode(object):
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution(object):
    def maxDepth(self, root):
        """
        :type root: TreeNode
        :rtype: int
        """
        def dfs(node):
            ret = 1
            if node.left != None:
                ret = max(ret, dfs(node.left) + 1)
            if node.right != None:
                ret = max(ret, dfs(node.right) + 1)
            return ret
        
        if root == None:
            return 0
        else:
            return dfs(root)