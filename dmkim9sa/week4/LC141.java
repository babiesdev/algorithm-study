package leetcode.week4;

import java.util.HashSet;
import java.util.Set;

// Linked List Cycle
public class LC141 {

    // 토끼와 거북이 알고리즘
    public static boolean hasCycleRabbit(ListNode head) {

        ListNode fast = head;
        ListNode slow = head;

        while(fast != null && slow != null) {
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow) {
                return true;
            }
        }
        return false;
    }

    public static boolean hasCycle(ListNode head) {
        Set<ListNode> set = new HashSet<>();
        while(head != null) {
            set.add(head);
            if(set.contains(head.next)) {
                return true;
            }
            head = head.next;
        }
        return false;
    }

    static class ListNode {
        int val;
        ListNode next;
        
        ListNode(int x) {
            val = x;
            next = null;
        }
  }
}
