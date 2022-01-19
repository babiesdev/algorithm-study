# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, val=0, left=None, right=None):
#         self.val = val
#         self.left = left
#         self.right = right
class Solution:
    def isValidBST(self, root: Optional[TreeNode]) -> bool:
    
        li = []
        
        def inorder(now):
            if not now:
                return
            
            inorder(now.left)
            li.append(now.val)
            inorder(now.right)
            
        inorder(root)
            
        for i in range(1,len(li)):
            if li[i] <= li[i-1]:
                return False
        
        return True
        
        # sorted_li = sorted(li)
        # return sorted_li == li
        
#         def dfs(now):
#             if not now:
#                 return [True, None]
            
#             boolean = True
            
#             l = dfs(now.left)
#             r = dfs(now.right)
            
#             # 이전 자식이 None이면 넘기기
#             if l[1] == None:
#                 pass
#             elif l[1] >= now.val:
#                 boolean = False
                
#             if r[1] == None:
#                 pass
#             elif r[1] <= now.val:
#                 boolean = False
                
#             return [boolean, now.val]
        
#         return dfs(root)[0]
    
    