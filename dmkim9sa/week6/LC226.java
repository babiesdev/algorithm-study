package leetcode.week6;

import java.util.LinkedList;
import java.util.Queue;

// Invert Binary Tree
public class LC226 {

    public static void main(String[] args) {
        TreeNode root = new TreeNode(4
                , new TreeNode(2, new TreeNode(1), new TreeNode(3))
                , new TreeNode(7, new TreeNode(6), new TreeNode(9)));
        TreeNode solution = invertTreeBFS(root);
        System.out.println("solution.toString() = " + solution.toString());
    }

    public static TreeNode invertTreeBFS(TreeNode root) {

        if(root == null) return null;

        // BFS -> Queue로 구현
        Queue<TreeNode> queue = new LinkedList<>();

        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode currNode = queue.poll();

            TreeNode tempNode = currNode.right;
            currNode.right = currNode.left;
            currNode.left = tempNode;

            if(currNode.left != null) {
                queue.add(currNode.left);
            }
            if(currNode.right != null) {
                queue.add(currNode.right);
            }
        }

        return root;
    }

    // 재귀
    public static TreeNode invertTree(TreeNode root) {

        if(root == null) return null;

        TreeNode tmp = root.right;
        root.right = root.left;
        root.left = tmp;

        if(root.left != null) invertTree(root.left);
        if(root.right != null) invertTree(root.right);

        return root;
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
