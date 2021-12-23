package leetcode.week9;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * Binary Tree Level Order Traversal
 * Related Topic: Binary Tree, BFS(Breadth-First Search)
 */

public class LC102 {

    public static void main(String[] args) {
        List<List<Integer>> solution = levelOrder
                (new TreeNode(3, new TreeNode(9), new TreeNode(20, new TreeNode(15), new TreeNode(7))));
        System.out.println(solution.toString());

    }

    public static List<List<Integer>> levelOrder(TreeNode root) {

        List<List<Integer>> lists = new ArrayList<>();
        if(root == null) return lists;

        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);

        while(!q.isEmpty()) {
            List<Integer> list = new ArrayList<>();

            int size = q.size();
            for (int i = 0; i < size; i++) {
                TreeNode curNode = q.poll();
                list.add(curNode.val);

                if(curNode.left != null) q.add(curNode.left);
                if(curNode.right != null) q.add(curNode.right);
            }
            lists.add(list);
        }

        return lists;
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