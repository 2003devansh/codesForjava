package BINARY_TREE.BFS;
// https://leetcode.com/problems/populating-next-right-pointers-in-each-node/

import recursion.array_rec.returningarraylist;

public class Leetcode116 {

    public static void main(String[] args) {
        
    }

    class Node {
        public int val;
        public Node left;
        public Node right;
        public Node next;
    
        public Node() {}
        
        public Node(int _val) {
            val = val;
        }
    
        public Node(int val, Node left, Node right, Node next) {
            val = val;
            left = left;
            right = right;
            next = next;
        }
    };
       

    public Node connect(Node root) {
        if (root == null) {
            return null ;
            
        }

        Node leftMost = root ; 

        while (leftMost.left != null){
            Node current = leftMost ;
            while (current != null) {
                current.left.next = current.right ;

                if(current.next != null){
                    current.right.next = current.next.left ;
                }
                current = current.next ;
                
            }
            leftMost = leftMost.left ;
            
        }
        return root ; 
        

    }

}
 