from collections import deque
# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right


class Solution:
    def maxDepth(self, root: Optional[TreeNode]) -> int:
        def bfs():
            max_level = 0

            q = deque()

            q.append([root, 0])

            while q:
                parent, level = q.popleft()

                if parent:
                    q.append([parent.left, level + 1])
                    q.append([parent.right, level + 1])

                max_level = max(max_level, level)

            return max_level

        return bfs()
