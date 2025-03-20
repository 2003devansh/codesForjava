package BINARY_TREE.Implementation;

import java.util.Scanner;

public class BT {

    public BT() {
    }

    // Node class
    public static class Node {
        int value;
        Node left;  // Reference to the left child
        Node right; // Reference to the right child

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root; // Root node of the tree

    // Insert elements into the binary tree
    public void insert(Scanner sc) {
        System.out.println("Enter the value of the root node:");
        int value = sc.nextInt();
        root = new Node(value);
        insert(sc, root);
    }

    private void insert(Scanner sc, Node node) {
        // Insert left child
        System.out.println("Do you want to enter the left child of " + node.value + "? (true/false):");
        boolean left = sc.nextBoolean();
        if (left) {
            System.out.println("Enter the value of the left child of " + node.value + ":");
            int value = sc.nextInt();
            node.left = new Node(value);  // Create the left child node
            insert(sc, node.left);       // Recursively insert into the left child
        }

        // Insert right child
        System.out.println("Do you want to enter the right child of " + node.value + "? (true/false):");
        boolean right = sc.nextBoolean();
        if (right) {
            System.out.println("Enter the value of the right child of " + node.value + ":");
            int value = sc.nextInt();
            node.right = new Node(value); // Create the right child node
            insert(sc, node.right);       // Recursively insert into the right child
        }
    }

    // Display the tree structure (beautified)
    public void display() {
        System.out.println("\nBinary Tree Structure:");
        displayTree(root, 0, "Root"); // Start with the root
    }

    private void displayTree(Node node, int level, String relation) {
        if (node == null) {
            return;
        }

        // Print the right subtree first
        displayTree(node.right, level + 1, "Right");

        // Print the current node
        String indent = "     ".repeat(level); // Indentation based on the level
        System.out.println(indent + relation + " --> " + node.value);

        // Print the left subtree
        displayTree(node.left, level + 1, "Left");
    }

    // Main method for testing
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BT tree = new BT();

        // Insert nodes
        tree.insert(sc);

        // Display the tree structure
        tree.display();

        sc.close();
    }
}
