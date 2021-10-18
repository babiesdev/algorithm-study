# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reverseList(self, head: Optional[ListNode]) -> Optional[ListNode]:
        stack = []
        tail = ListNode()
        temp_tail = tail

        while head:
            stack.append(head)
            head = head.next

        while stack:
            stacked = stack.pop()
            tail.next = ListNode()
            tail.next.val = stacked.val
            tail = tail.next

        return temp_tail.next
