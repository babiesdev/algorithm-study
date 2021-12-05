/**
 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

class Solution21 {
    public ListNode21 mergeTwoLists(ListNode21 l1, ListNode21 l2) {
        if (l1 == null) {
            return l2;
        } else if (l2 == null) {
            return l1;
        } else if (l1.val21 < l2.val21) {
            l1.next21 = mergeTwoLists(l1.next21, l2);
            return l1;
        } else {
            l2.next21 = mergeTwoLists(l1, l2.next21);
            return l2;
        }
    }

    public static class ListNode21 {
        int val21;
        ListNode21 next21;
    }
}