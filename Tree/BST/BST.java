package Tree.BST;

import org.w3c.dom.Node;

public class BST {

    private class Node{
        private int value ;
        private int height;
        private Node right;
        private Node left;

        public Node(int value){
            this.value = value;
        }

        public int getvalue(){
            return value;
        }
      
    }

    private Node root;

    public BST(){
        
    }

    public int height(Node node){
        if(node == null){
            return -1;
        }
        return node.height;
    }
    public boolean isEmpty(){
        return root == null;
    }

    private Node insert(int value , Node node){
        if(node == null){
            node = new Node(value);
            return node;
        }

        if(value < node.value){
            node.left = insert(value,node.left);
        }
        if(value > node.value){
            node.right = insert(value, node.right);
        }
        return node;
    }
    
}
