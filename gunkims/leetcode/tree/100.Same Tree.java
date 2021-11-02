public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();

        TreeNode treeNode = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3, new TreeNode(6), new TreeNode(7)));
        TreeNode treeNode2 = new TreeNode(1, new TreeNode(2, new TreeNode(4), new TreeNode(5)), new TreeNode(3));

        System.out.println(solution.isSameTree(treeNode, treeNode2));
    }
}
class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
//재귀를 이용한 풀이
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;
        if(p.val != q.val) return false;

        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
    }
}
//BFS를 이용한 풀이
class Solution2 {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;

        Queue<TreeNode> pQueue = new LinkedList<>();
        pQueue.offer(p);
        Queue<TreeNode> qQueue = new LinkedList<>();
        qQueue.offer(q);

        while(!pQueue.isEmpty() || !qQueue.isEmpty()) {
            TreeNode currentP = pQueue.poll();
            TreeNode currentQ = qQueue.poll();

            if(currentP == null && currentQ == null) continue;
            if(currentP != null && currentQ == null) return false;
            if(currentQ != null && currentP == null) return false;
            if(currentP.val != currentQ.val) return false;
            
            pQueue.offer(currentP.left);
            pQueue.offer(currentP.right);
            qQueue.offer(currentQ.left);
            qQueue.offer(currentQ.right);
        }
        return true;
    }
}