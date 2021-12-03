# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next
class Solution:
    def mergeTwoLists(self, list1: Optional[ListNode], list2: Optional[ListNode]) -> Optional[ListNode]:
        tail = ListNode()
        head = tail

        if not (list1 or list2):
            return list1

        while True:
            # 두 리스트 중 하나가 비었으면 남은 리스트를 붙임
            if list1 == None or list2 == None:
                tail.val = list2.val if list1 == None else list1.val
                tail.next = list2.next if list1 == None else list1.next
                break

            if list1.val > list2.val:
                tail.val = list2.val
                list2 = list2.next
            else:
                tail.val = list1.val
                list1 = list1.next

            tail.next = ListNode()
            tail = tail.next

        return head
