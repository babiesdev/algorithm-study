# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def maxPathSum(self, root: Optional[TreeNode]) -> int:
        max_value = [-10e8]

        def dfs(now):
            if not now:
                return 0

            # 왼쪽, 오른쪽 자식이 반환하는 수
            l = dfs(now.left)
            r = dfs(now.right)

            # now 노드의 최대값. 리프노드부터 최대값을 갱신했으므로 항상 최대값을 보장
            fall_case = max(max(l, r) + now.val, now.val)

            # now 노드가 서브 트리의 루트일때. 서브 트리도 리프노드부터 갱신하므로 항상 최대값
            # 상위 서브 트리에 영향을 주지 않으므로 함수 내에서 max_value 계산용으로만 사용
            link_case = max(l + r + now.val, fall_case)

            # 최대값 갱신
            max_value[0] = max(max_value[0], link_case)

            # 리프노드의 최대값부터 반환
            return fall_case

        dfs(root)

        return max_value[0]
