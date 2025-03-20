package Tree.BinaryTree;

import java.util.Scanner;

public class BT {

    public BT() {

    }

    private static class Node {
        int value;
        Node left;
        Node right;

        public Node(int value) {
            this.value = value;
        }
    }

    private Node root;

    // inserting the value

    public void populate(Scanner scanner) {
        System.out.println("Enter the value of the root node");
        int value = scanner.nextInt();
        root = new Node(value);
        populate(scanner, root);

    }

    private void populate(Scanner scanner, Node node) {
        System.out.println("do you want to enter the left node of " + node.value);
        boolean left = scanner.nextBoolean();
        if (left) {
            System.out.println("enter the value of the left of " + node.value);
            int value = scanner.nextInt();
            node.left = new Node(value);
            populate(scanner, node.left);
        }

        System.out.println("do you want to enter the right of " + node.value);
        boolean right = scanner.nextBoolean();
        if (right) {
            System.out.println("enter the value of the right node of " + node.value);
            int value = scanner.nextInt();
            node.right = new Node(value);
            populate(scanner, node.right);

        }
    }

    public void display() {
        display(root, "");
    }

    private void display(Node node, String indent) {
        if (node == null) {
            return;
        }

        System.out.println(indent + node.value);
        display(node.left, indent + "\t");
        display(node.right, indent + "\t");

    }

}
