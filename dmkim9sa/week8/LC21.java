package leetcode.week8;

import java.util.LinkedList;
import java.util.List;

/**
 * Merge Two Sorted Lists
 * Related Topic : Linked List, Recursion
 */
public class LC21 {

    public static void main(String[] args) {
        ListNode list1 = new ListNode(1, new ListNode(2, new ListNode(3)));
        ListNode list2 = new ListNode(1, new ListNode(3, new ListNode(4)));
        ListNode listNode = mergeTwoLists(list1, list2);
        System.out.println("listNode = " + listNode);
    }

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode mergeNode = new ListNode(0);
        ListNode currNode = mergeNode;

        while (list1.next != null && list2.next != null) {
            System.out.println("currNode = " + currNode.toString());
            if (list1.val <= list2.val) {
                currNode.next = list1;
                list1 = list1.next;
            }else {
                currNode.next = list2;
                list2 = list2.next;
            }

            currNode = currNode.next;
        }

        if(list1 == null) {
            currNode.next = list2;
        }else {
            currNode.next = list1;
        }

        return mergeNode.next;
    }

    static class ListNode {

        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }

        @Override
        public String toString() {
            return "ListNode{" + "현재 노드 = " + val + ", 다음 노드의 포인터 = " + next + '}';
        }
    }
}