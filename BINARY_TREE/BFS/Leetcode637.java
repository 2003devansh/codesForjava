package BINARY_TREE.BFS;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Leetcode637 {
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
    
      public List<Double> averageOfLevels(TreeNode root) {
         List<Double> result = new ArrayList<>();

         if(root == null){
            return result ;
         }

         Queue<TreeNode> queue = new LinkedList<>();
         queue.offer(root);

         while (!queue.isEmpty()) {
            int levelsize = queue.size();
            double averagelevel = 0 ;
            for(int i =0 ; i < levelsize; i++){
                TreeNode currentNode = queue.poll();
                // The queue.poll() method is used to retrieve and remove the head (first element) of the queue. 
                averagelevel += currentNode.val ; 
                if(currentNode.left != null){
                    queue.offer(currentNode.left);
                }
                if(currentNode.right != null){
                    queue.offer(currentNode.right);
                }
            }
            averagelevel = averagelevel/levelsize ;
            result.add(averagelevel) ;

            
         }

         return result ; 
    }
    


}
