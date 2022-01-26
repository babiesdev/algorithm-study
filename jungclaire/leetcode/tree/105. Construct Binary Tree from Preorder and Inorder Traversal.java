import java.util.HashMap;
import java.util.Stack;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 * int val;
 * TreeNode left;
 * TreeNode right;
 * TreeNode() {}
 * TreeNode(int val) { this.val = val; }
 * TreeNode(int val, TreeNode left, TreeNode right) {
 * this.val = val;
 * this.left = left;
 * this.right = right;
 * }
 * }
 */
class Solution105 {
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        TreeNode root = null;
        if (preorder.length != inorder.length)
            return null;

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < inorder.length; i++)
            map.put(inorder[i], i);

        TreeNode p = null;
        Stack<TreeNode> tree = new Stack<>();

        for (int j : preorder) {
            int temp = map.get(j);
            TreeNode node = new TreeNode(j);
            if (tree.isEmpty()) {
                root = node;
                tree.add(node);
                p = root;
            } else {
                if (temp < map.get(tree.peek().val)) {
                    p.left = node;
                    p = p.left;
                } else {
                    while (!tree.isEmpty() && temp > map.get(tree.peek().val))
                        p = tree.pop();
                    p.right = node;
                    p = p.right;
                }
            }
            tree.add(node);
        }
        return root;
    }
}