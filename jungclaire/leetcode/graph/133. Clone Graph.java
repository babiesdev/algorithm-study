/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/
import java.util.*;

class Solution133 {
    public Node133 cloneGraph(Node133 node) {
        if (node == null)
            return null;
        Queue<Node133> queue = new LinkedList<>();
        Map<Node133, Node133> map = new HashMap<>();
        Node133 newNode = new Node133(node.val, new ArrayList<>());
        map.put(node, newNode);
        queue.add(node);
        while (!queue.isEmpty()) {
            Node133 cursor = queue.poll();
            for (Node133 neighbor : cursor.neighbors) {
                if (!map.containsKey(neighbor)) {
                    map.put(neighbor, new Node133(neighbor.val, new ArrayList<>()));
                    queue.add(neighbor);
                }
                map.get(cursor).neighbors.add(map.get(neighbor));
            }
        }
        return newNode;
    }
}

class Node133 {
    public int val;
    public List<Node133> neighbors;
    public Node133() {
        val = 0;
        neighbors = new ArrayList<>();
    }
    public Node133(int _val) {
        val = _val;
        neighbors = new ArrayList<>();
    }
    public Node133(int _val, ArrayList<Node133> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}