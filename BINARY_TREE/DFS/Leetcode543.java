package BINARY_TREE.DFS;

public abstract class Leetcode543 {
    public static void main(String[] args) {
        
    }
    int diameter = 0; 

    public int diameterOfBinaryTree(TreeNode root) {
        height(root) ;
        return diameter -1 ; // substracing 1 because the diameter is the number of nodes on the longest path between two nodes in the tree
    }

    private int height(TreeNode node){
        if(node == null){
            return 0 ;
        }

        int leftHeight = height(node.left) ;
        int rightHeight = height(node.right) ;

        int dia = leftHeight + rightHeight +1 ; 
        diameter = Math.max(diameter, dia) ;
        return Math.max(leftHeight, rightHeight) + 1 ; // return the height of the tree
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
    
}
