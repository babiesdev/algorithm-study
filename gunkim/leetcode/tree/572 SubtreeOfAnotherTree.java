import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isSubtree(
                new TreeNode(3,
                        new TreeNode(4,
                                new TreeNode(1),
                                new TreeNode(2)),
                        new TreeNode(5)),
                new TreeNode(4,
                        new TreeNode(1),
                        new TreeNode(2))));
    }
}

class Solution {
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean isSame = false;
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();

            if (node.val == subRoot.val) {
                isSame = isSame || areTreesEqual(node, subRoot);
            }
            if (isSame) {
                return true;
            }
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }
        return false;
    }

    public boolean areTreesEqual(TreeNode n1, TreeNode n2) {
        if (n1 == null && n2 == null) {
            return true;
        }
        if ((n1 == null && n2 != null) || (n1 != null && n2 == null)) {
            return false;
        }
        if (n1.val != n2.val) {
            return false;
        }
        return areTreesEqual(n1.left, n2.left) && areTreesEqual(n1.right, n2.right);
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