package leetcode.week11;

/**
 * Remove Nth Node From End of List
 */
public class LC19 {

    public ListNode removeNthFromEnd(ListNode head, int n) {

        ListNode start = new ListNode(0);
        start.next = head;

        ListNode left = start;
        ListNode right = start;

        for(int i = 0; i < n; i++) {
            right = right.next;
        }

        while(right.next != null) {
            left = left.next;
            right = right.next;
        }

        left.next = left.next.next;
        return start.next;
    }

    static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}
