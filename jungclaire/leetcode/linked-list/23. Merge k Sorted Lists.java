import java.util.ArrayList;
import java.util.Collections;

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
class Solution23 {
    public ListNode23 mergeKLists(ListNode23[] lists) {
        if (lists.length == 0) return null;
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < lists.length; i++) {
            while (lists[i] != null) {
                arr.add(lists[i].val23);
                lists[i] = lists[i].next23;
            }
        }

        Collections.sort(arr);

        ListNode23 head = new ListNode23(0);
        ListNode23 temp = head;
        for (Integer integer : arr) {
            temp.next23 = new ListNode23(integer);
            temp = temp.next23;
        }
        arr.clear();
        return head.next23;
    }

    public static class ListNode23 {
        int val23;
        ListNode23 next23;

        ListNode23(int val23) {
            this.val23 = val23;
        }
    }
}