# Definition for singly-linked list.
# class ListNode(object):
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution(object):
    def reverseList(self, head):
        """
        :type head: ListNode
        :rtype: ListNode
        """
        val_list = []
        cur = head
        while cur != None:
            val_list.append(cur.val)
            cur = cur.next
        
        cur = head
        for i in reversed(range(len(val_list))):
            cur.val = val_list[i]
            cur = cur.next
        return head