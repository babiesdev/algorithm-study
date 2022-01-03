# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def buildTree(self, preorder: List[int], inorder: List[int]) -> Optional[TreeNode]:

        preorder = deque(preorder)
        inorder = deque(inorder)

        def tree(val):
            # 배열이 비거나 리프노드라고 판단되면 None 리턴
            if not inorder or inorder[0] == val:
                return

            # 현재 위치를 노드로 선언하여 헤드를 옮길 수 있게 함
            head = TreeNode(preorder.popleft())
            head.left = tree(head.val)  # 왼쪽 서브트리에 재귀 형식으로 값을 넘김
            inorder.popleft()  # preorder와 순서를 맞추기 위해 pop
            head.right = tree(val)  # 오른쪽 서브트리에 현재 값을 넘겨 반복

            return head

        return tree(None)
