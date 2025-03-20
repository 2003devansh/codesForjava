package BINARY_TREE.BFS;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode404 {
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
    
    public int sumOfLeftLeaves(TreeNode root) {
     if(root == null){
        return 0 ; 
     }

     Queue<TreeNode> queue = new LinkedList<>() ;
     queue.offer(root) ;
     int leftSum = 0; 
     while(!queue.isEmpty()){
        int leverSize = queue.size(); 
        for(int i = 0; i < leverSize ; i++){
            TreeNode currentNode = queue.poll()  ;
            if(currentNode.left != null){
              if(currentNode.left.left == null && currentNode.left.right == null){
                leftSum += currentNode.val ; 
              }else{
                queue.offer(currentNode.left) ;
              }
            }else{
                queue.offer(currentNode.right) ; 
            }
        }
     }
     return leftSum ;
    }

}
