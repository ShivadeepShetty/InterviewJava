package ds.Tree;

import java.util.Random;

public class TreeTest {

    public static void main(String[] args) {
        Tree tree = new Tree();
        int value;
        Random randomNumber = new Random();

        System.out.println("Inserting the following values");
        for(int i = 0 ; i<=10 ; i++){
            value = randomNumber.nextInt(100);
            tree.insertNode(value);
        }
        System.out.println("\n\n PreorderTraversal");
        tree.preOrderTraversal();
        System.out.println("\n\n InOrderTraversal");
        tree.inOrderTraversal();
        System.out.println("\n\n PostorderTraversal");
        tree.postOrderTraversal();
    }
}
