from collections import deque

# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right


class Solution:
    def levelOrder(self, root: Optional[TreeNode]) -> List[List[int]]:
        li = []

        def bfs(now, level):
            q = deque()
            q.append([now, level])

            while q:
                now, level = q.popleft()

                if not now:
                    continue

                if len(li) <= level:
                    li.append([])

                li[level].append(now.val)

                q.append([now.left, level+1])
                q.append([now.right, level+1])

        bfs(root, 0)

        return li
