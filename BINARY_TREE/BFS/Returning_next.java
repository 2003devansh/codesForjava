package BINARY_TREE.BFS;

import java.util.LinkedList;
import java.util.Queue;

// Level order successor refers to the node in a
// binary tree that comes immediately after a given node in a level-order traversa


public class Returning_next {
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

    public TreeNode findSuccessor(TreeNode root,int key){
        if(root == null){
            return null ;
        }

        Queue<TreeNode> queue = new LinkedList<>(); 
        queue.offer(root) ;

        while (!queue.isEmpty()) {
            TreeNode currentNode = queue.poll();
            if(currentNode.left != null){
                queue.offer(currentNode.left);
            }
            if(currentNode.right != null){
                queue.offer(currentNode.right);
            }
            if(currentNode.val == key ){
                break ;
            }
        }
        return queue.peek() ;
        // queue.peek() is a method used to retrieve the element at the front of the queue without removing it. 
    }

    // differnce between .poll() and .peek() is first one retrieve element and remove it 
    // and the second one only retrive it without removing  
    
    
}
