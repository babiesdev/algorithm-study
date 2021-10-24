public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxDepth(new TreeNode(1, new TreeNode(1, new TreeNode(3, new TreeNode(4, null, null), null), null), new TreeNode(3))));
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
class Solution {
    public int solve(TreeNode node, int depth) {
        if(node == null) {
            return depth;
        }
        return Math.max(solve(node.left, depth+1), solve(node.right, depth+1));
    }
    public int maxDepth(TreeNode root) {
        int res = solve(root, 0);
        return res;
    }
}