package leetcode.week4;

import java.util.LinkedList;
import java.util.Queue;

// Same Tree
public class LC100 {

    public static void main(String[] args) {
        TreeNode t1 = new TreeNode(1, new TreeNode(2), null);
        TreeNode t2 = new TreeNode(1, null, new TreeNode(2));

        boolean isCheck = isSameTree(t1, t2);
        System.out.println("isCheck = " + isCheck);
    }

    // 재귀
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;

        if(p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }else {
            return false;
        }
    }

    // Queue
    public static boolean isSameTreeQueue(TreeNode p, TreeNode q) {
        if(p == null && q == null) return true;
        if(p == null || q == null) return false;

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(p);
        queue.offer(q);

        while (!queue.isEmpty()) {
            TreeNode n1 = queue.poll();
            TreeNode n2 = queue.poll();

            // 루트 노드의 값이 다르면 당연히 false!!
            if(n1.val != n2.val) return false;

            if(n1.left != null) queue.offer(n1.left);
            if(n2.left != null) queue.offer(n2.left);
            if(queue.size() % 2 != 0) return false;

            if(n1.right != null) queue.offer(n1.right);
            if(n2.right != null) queue.offer(n2.right);
            if(queue.size() % 2 != 0) return false;
        }

        return true;
    }


    // treeNode Class
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

        @Override
        public String toString() {
            return "TreeNode{" +
                    "val=" + val +
                    ", left=" + left +
                    ", right=" + right +
                    '}';
        }
    }
}


