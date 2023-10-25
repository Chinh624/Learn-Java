package Buoi9_t5;

public class main {
        public static void main(String[] args) {
            BinarySearchTree binarySearchTree = new BinarySearchTree();
            binarySearchTree.insert(25);
            binarySearchTree.insert(20);
            binarySearchTree.insert(15);
            binarySearchTree.insert(27);
            binarySearchTree.insert(30);
            binarySearchTree.insert(29);
            binarySearchTree.insert(26);
            binarySearchTree.insert(22);
            binarySearchTree.insert(32);
            binarySearchTree.insert(17);
    
            // Print the tree in order
            System.out.println("Original Tree:");
            binarySearchTree.traverseInOrder();
            System.out.println();
    
            // Delete a number from the tree (e.g., delete 20)
            int numberToDelete = 20;
            binarySearchTree.delete(numberToDelete);
    
            // Print the updated tree after deletion
            System.out.println("Tree after deleting " + numberToDelete + ":");
            binarySearchTree.traverseInOrder();
            System.out.println();
        }
    }