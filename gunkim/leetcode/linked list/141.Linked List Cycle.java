import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        ListNode node = new ListNode(2, new ListNode(0));
        node.addNode(new ListNode(4, node));
        System.out.println(solution.hasCycle(new ListNode(3, node)));
    }
}
class Solution {
    public boolean hasCycle(ListNode head) {
        ListNode current = head;
        Set<ListNode> nodeSet = new HashSet<>();
        while(current != null) {
            if(nodeSet.contains(current)) {
                return true;
            }
            nodeSet.add(current);
            current = current.next;
        }
        return false;
    }
}
class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
        next = null;
    }
    ListNode(int x, ListNode next) {
        val = x;
        this.next = next;
    }
    public void addNode(ListNode node) {
        this.next = node;
    }
}