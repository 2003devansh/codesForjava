package BINARY_TREE.DFS;

public class leetcode98 {
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
    
    public boolean isValidBST(TreeNode root) {
        if (root == null){} {
            return helper(root, null, null); 
        }
    }

    public boolean helper(TreeNode node , Integer low , Integer high){
        if(node == null){
            return true ;
        }

        if(low != null && node.val <= low){
            return false  ;
        }

        if(high != null &&  node.val >= high){
            return false ;
        }
        
        boolean left = helper(node.left, low, node.val) ;
        boolean right = helper(node.right, node.val , high) ;
        return left && right ;
    }
}
