package leetcode.week2;

import java.util.LinkedList;
import java.util.List;

// Reverse Linked List
public class LC206 {
    public static ListNode reverseList(ListNode head) {
        ListNode current = head;
        ListNode prev = null;
        ListNode next = null;

        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        head = prev;

        return head;
    }

    static class ListNode {
     int data; // 노드의 값
     ListNode next; // 다음 노드를 가리키는 포인터

     ListNode() {}
     ListNode(int data) { this.data = data; }
     ListNode(int data, ListNode next) { this.data = data; this.next = next; }
    }
}
