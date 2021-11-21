public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.maxPathSum(new TreeNode(1, new TreeNode(2), new TreeNode(3))));
    }
}

class Solution {
    public int max = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        getMax(root);
        return max;
    }

    private int getMax(TreeNode root) {
        if (root == null)
            return 0;
        int left = Math.max(getMax(root.left), 0);
        int right = Math.max(getMax(root.right), 0);
        if ((left + right + root.val) > max) {
            max = (left + right + root.val);
        }
        return Math.max(left, right) + root.val;
    }
}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;

    TreeNode() {
    }

    TreeNode(int val) {
        this.val = val;
    }

    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}