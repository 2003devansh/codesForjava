package BINARY_TREE.DFS;

public class Leetcode114 {
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
     
    public void flatten(TreeNode root) {
        if(root == null){
            return ;  // means the tree is empty
        } 

        TreeNode current = root ; 

        while(current != null){
            
             // finding  the right most element of the left subtree
             if(current.left != null){
                TreeNode temp = current.left ; 
                while(temp.right != null){ 
                    temp = temp.right; 
                }
                temp.right = current.right ;  // connecting the right subtree to the right most element of the left subtree
                current.right = current.left  ; // connecting the left subtree to the right subtree
                current.left = null ; 
            }
             current = current.right ; // changing the current node to the right node
        }
    }
}
