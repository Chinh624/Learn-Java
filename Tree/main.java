package Tree;

public class main {

    public static void main(String[] args) {
        // Example usage
        BinarySearchTreeNode root = new BinarySearchTreeNode(50);
        root.insert(30);
        root.insert(70);
        root.insert(20);
        root.insert(40);
        root.insert(60);
        root.insert(80);
        System.out.println("search tree");
        root.search(20);
        System.out.println("Pre-order traversal:");
        // qua node cha trước sau đến node con trái rồi mới đến node con phải.
        root.preOrderTraversal();
        // node con trái sau đến node cha rồi đến node con phải.
        System.out.println("\nIn-order traversal:");
        root.inOrderTraversal();
        // node con trái, node con phải rồi đến node cha.
        System.out.println("\nPost-order traversal:");
        root.postOrderTraversal();

    }
}
