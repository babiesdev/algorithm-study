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

class Solution {
    public Node cloneGraph(Node node) {
        if (node == null)
            return node;
        Queue<Node> queue = new LinkedList<>();
        Map<Node, Node> map = new HashMap<>();
        Node newNode = new Node(node.val, new ArrayList<>());
        map.put(node, newNode);
        queue.add(node);
        while (!queue.isEmpty()) {
            Node cursor = queue.poll();
            for (Node neighbor : cursor.neighbors) {
                if (!map.containsKey(neighbor)) {
                    map.put(neighbor, new Node(neighbor.val, new ArrayList<>()));
                    queue.add(neighbor);
                }
                map.get(cursor).neighbors.add(map.get(neighbor));
            }
        }
        return newNode;
    }
}