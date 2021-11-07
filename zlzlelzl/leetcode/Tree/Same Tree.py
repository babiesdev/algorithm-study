# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isSameTree(self, p: Optional[TreeNode], q: Optional[TreeNode]) -> bool:
        if p == None or q == None:
            if p == q:
                return True
            else:
                return False

        flag = [True]

        def preorder_search(p, q):
            if p.val != q.val:
                flag[0] = False

            if p.left and q.left:
                preorder_search(p.left, q.left)
            else:
                if p.left != q.left:
                    flag[0] = False

            if p.right and q.right:
                preorder_search(p.right, q.right)
            else:
                if p.right != q.right:
                    flag[0] = False

        preorder_search(p, q)

        return flag[0]
