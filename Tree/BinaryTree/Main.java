package Tree.BinaryTree;

import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BT tree = new BT();
        tree.populate(scanner);
        tree.display();

    }
}
