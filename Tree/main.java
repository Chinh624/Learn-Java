package Tree;

public class main {
    public static void main(String[] args) {
        // Example usage
        BinarySearchTreeNode root = new BinarySearchTreeNode(16);

        int[] valuesToInsert = { 27, 32, 12, 52, 39, 76, 18, 4, 25, 69, 10, 8, 16 };
        for (int value : valuesToInsert) {
            root.insert(value);
        }

        System.out.println("Pre-order traversal:");
        root.preOrderTraversal();
        System.out.println("\nIn-order traversal:");
        root.inOrderTraversal();
        System.out.println("\nPost-order traversal:");
        root.postOrderTraversal();
        System.out.println("\nReverse");
        root.reverse();
        int numberOfNodes = root.countNodes();
        System.out.println("\nNumber of nodes in the tree: " + numberOfNodes);

        System.out.println("================================================================");

        int keyToSearch = 16;

        BinarySearchTreeNode foundNode = root.search(keyToSearch);
        if (foundNode != null) {
            System.out.println("Node with key " + keyToSearch + " found in the tree.");
        } else {
            System.out.println("Node with key " + keyToSearch + " not found in the tree.");
        }

        root.maxNode();
        root.minNode();

    }
}
