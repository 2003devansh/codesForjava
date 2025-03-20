package BINARY_TREE.BFS;
// https://leetcode.com/problems/merge-two-binary-trees/?envType=problem-list-v2&envId=breadth-first-search

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode617 {
    public static void main(String[] args) {
        
    }
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) {
            this.val = val;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
     
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if (root1 == null) return root2;
        if (root2 == null) return root1;


        TreeNode root3 = new TreeNode(root1.val + root2.val);


        Queue<TreeNode> queue1 = new LinkedList<>();
        Queue<TreeNode> queue2 = new LinkedList<>();
        Queue<TreeNode> queue3 = new LinkedList<>();

        queue1.offer(root1);
        queue2.offer(root2);
        queue3.offer(root3);

        while (!queue1.isEmpty() && !queue2.isEmpty()) {
            TreeNode currentNode1 = queue1.poll();
            TreeNode currentNode2 = queue2.poll();
            TreeNode currentNode3 = queue3.poll();

            if (currentNode1.left != null || currentNode2.left != null) {
                if (currentNode1.left != null && currentNode2.left != null) {
                    currentNode3.left = new TreeNode(currentNode1.left.val + currentNode2.left.val);
                    queue1.offer(currentNode1.left);
                    queue2.offer(currentNode2.left);
                    queue3.offer(currentNode3.left);
                } else if (currentNode1.left != null) {
                    currentNode3.left = new TreeNode(currentNode1.left.val);
                    queue1.offer(currentNode1.left);
                    queue3.offer(currentNode3.left);
                } else {
                    currentNode3.left = new TreeNode(currentNode2.left.val);
                    queue2.offer(currentNode2.left);
                    queue3.offer(currentNode3.left);
                }
            }

            if (currentNode1.right != null || currentNode2.right != null) {
                if (currentNode1.right != null && currentNode2.right != null) {
                    currentNode3.right = new TreeNode(currentNode1.right.val + currentNode2.right.val);
                    queue1.offer(currentNode1.right);
                    queue2.offer(currentNode2.right);
                    queue3.offer(currentNode3.right);
                } else if (currentNode1.right != null) {
                    currentNode3.right = new TreeNode(currentNode1.right.val);
                    queue1.offer(currentNode1.right);
                    queue3.offer(currentNode3.right);
                } else {
                    currentNode3.right = new TreeNode(currentNode2.right.val);
                    queue2.offer(currentNode2.right);
                    queue3.offer(currentNode3.right);
                }
            }
        }

        return root3;

    }
}
