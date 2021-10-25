package leetcode.linkedList;

import java.util.Stack;

public class Q206_ReverseLinkedList {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static ListNode reverseList(ListNode head) {
        ListNode reverse = null;
        System.out.println(head.val);
        System.out.println(head.next);
        System.out.println(head.next.val);
        while(head != null){
            ListNode temp = head;
            head = head.next;
            temp.next = reverse;
            reverse = temp;
        }
        return reverse;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1, new ListNode(2,new ListNode(3, new ListNode(4, new ListNode(5)))));
        reverseList(head);
    }
}

