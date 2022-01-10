# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def reorderList(self, head: Optional[ListNode]) -> None:
        """
        Do not return anything, modify head in-place instead.
        """
        
        d = deque()
        
        while head:
            d.append(head)
            head = head.next

        head = ListNode()
        temp = head
        while d:
            head.next = d.popleft()
            head = head.next
            head.next = None
            if not d:
                break
            head.next = d.pop()
            head = head.next
            head.next = None