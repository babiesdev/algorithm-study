# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def removeNthFromEnd(self, head: Optional[ListNode], n: int) -> Optional[ListNode]:

        stack = []

        temp = head

        while head:
            stack.append(head)
            head = head.next

        if len(stack) == 1:  # 문제 조건에 따라 n은 1밖에 안나옴
            return head

        # 첫 인덱스와 끝 인덱스일때 예외처리
        if n == 1:
            stack[-2].next = head
            return temp
        elif n == len(stack):
            return temp.next

        stack[-n-1].next = stack[-n+1]

        return temp
