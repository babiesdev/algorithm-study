# Definition for a binary tree node.
# class TreeNode:
#     def __init__(self, x):
#         self.val = x
#         self.left = None
#         self.right = None

class Solution:
    def lowestCommonAncestor(self, root: 'TreeNode', p: 'TreeNode', q: 'TreeNode') -> 'TreeNode':
        
        p_li = []
        q_li = []
        
        def find_node(now, find_val, li):
            li.append(now)
            
            if now.val == find_val:
                return li
            
            if now.val < find_val:
                return find_node(now.right,find_val,li)
            else:
                return find_node(now.left,find_val,li)
                
        p_li = find_node(root,p.val,[])
        q_li = find_node(root,q.val,[])
        
        last_parent = root.val
        
        idx = 0

        while idx < len(p_li) and idx < len(q_li):
            if p_li[idx].val != q_li[idx].val:
                break
            last_parent = p_li[idx]
            idx += 1
            
        return last_parent