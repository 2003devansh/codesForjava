package BINARY_TREE.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BFS {
    public static void main(String[] args) {
      
    }

    static class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }

    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> result = new ArrayList<>();

        if (root == null) {
            return result;
        }

        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        // The queue.offer() method is used to insert an element into the queue 
        
        while (!queue.isEmpty()) {
            int levelsize = queue.size() ;
            List<Integer> currentLevel = new ArrayList<>();
            for(int i =0 ; i < levelsize; i++){
                TreeNode currentNode = queue.poll();
                // The queue.poll() method is used to retrieve and remove the head (first element) of the queue. 
                currentLevel.add(currentNode.val) ;
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            result.add(currentLevel) ;
        }

        return result;
    }
}
