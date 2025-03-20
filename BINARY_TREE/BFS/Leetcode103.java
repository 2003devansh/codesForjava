package BINARY_TREE.BFS;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;

public class Leetcode103 {
    public static void main(String[] args) {
        Leetcode103 obj = new Leetcode103();

        // Constructing a sample binary tree:
        //         1
        //       /   \
        //      2     3
        //     / \   / \
        //    4   5 6   7

        TreeNode root = obj.new TreeNode(1);
        root.left = obj.new TreeNode(2);
        root.right = obj.new TreeNode(3);
        root.left.left = obj.new TreeNode(4);
        root.left.right = obj.new TreeNode(5);
        root.right.left = obj.new TreeNode(6);
        root.right.right = obj.new TreeNode(7);

        // Call the zigzagLevelOrder method and print the result
        List<List<Integer>> result = obj.zigzagLevelOrder(root);
        System.out.println("Zigzag Level Order Traversal: " + result);
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

    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }
        Deque<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        boolean reverse = false;

        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            List<Integer> currentLevel = new ArrayList<>();
            for (int i = 0; i < levelSize; i++) {
                if (!reverse) {
                    TreeNode currentNode = queue.pollFirst();
                    currentLevel.add(currentNode.val);
                    if (currentNode.left != null) {
                        queue.offer(currentNode.left);
                    }
                    if (currentNode.right != null) {
                        queue.offer(currentNode.right);
                    }
                } else {
                    TreeNode currentNode = queue.pollLast();
                    currentLevel.add(currentNode.val);
                    if (currentNode.right != null) {
                        queue.offerFirst(currentNode.right);
                    }
                    if (currentNode.left != null) {
                        queue.offerFirst(currentNode.left);
                    }
                }
            }
            reverse = !reverse; // agr reverse hoga toh not reverse ho jayega aur agr not reverse hoga toh reverse ho jayega 
            
            result.add(currentLevel);
        }

        return result;
    }
}
