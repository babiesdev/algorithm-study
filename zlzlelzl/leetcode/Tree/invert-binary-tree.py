from collections import deque

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right


class Solution:
    def invertTree(self, root: Optional[TreeNode]) -> Optional[TreeNode]:
        if not root:
            return root

        def swap_l_and_r(node):
            node.left, node.right = node.right, node.left

        def bfs():
            q = deque()

            q.append(root)

            while q:
                now = q.popleft()

                swap_l_and_r(now)

                if now.left:
                    q.append(now.left)
                if now.right:
                    q.append(now.right)

        bfs()

        return root
