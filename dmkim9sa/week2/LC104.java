package leetcode.week2;

import javax.swing.tree.TreeNode;

// Maximum Depth of Binary Tree
public class LC104 {
    public int maxDepth(TreeNode root) {
        int leftNode = 0; // 왼쪽 트리의 깊이
        int rightNode = 0; // 오른쪽 트리의 깊이
        if(root == null) {
            return 0;
        } else {
            leftNode = maxDepth(root.left);
            rightNode = maxDepth(root.right);

            return Math.max(leftNode, rightNode) + 1;
        }
    }

    static class TreeNode {
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
}