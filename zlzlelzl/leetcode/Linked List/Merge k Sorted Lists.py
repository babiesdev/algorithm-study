import heapq

# Definition for singly-linked list.
# class ListNode:
#     def __init__(self, val=0, next=None):
#         self.val = val
#         self.next = next


class Solution:
    def mergeKLists(self, lists: List[Optional[ListNode]]) -> Optional[ListNode]:
        if len(lists) == 0:
            return

        _dict = {i: lists[i].val for i in range(
            len(lists)) if lists[i] != None}

        if len(_dict) == 0:
            return

        hq = []
        for i in _dict:
            heapq.heappush(hq, [_dict[i], i])

        tail = ListNode()
        head = tail

        while hq:
            # 노드를 꺼내서 테일에 붙이고 테일 넥스트노드
            cur_node_val, cur_idx = heapq.heappop(hq)
            tail.val = cur_node_val
            if lists[cur_idx].next != None:
                lists[cur_idx] = lists[cur_idx].next
                heapq.heappush(hq, [lists[cur_idx].val, cur_idx])

            if not hq:
                break

            tail.next = ListNode()
            tail = tail.next

        return head
