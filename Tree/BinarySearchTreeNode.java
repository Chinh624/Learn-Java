package Tree;

public class BinarySearchTreeNode {
    private int data;
    private BinarySearchTreeNode left;
    private BinarySearchTreeNode right;

    // Constructor
    public BinarySearchTreeNode(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    // Search
    public BinarySearchTreeNode search(int key) {
        if (key == data) {
            return this;
        } else if (key < data && left != null) {
            return left.search(key);
        } else if (key > data && right != null) {
            return right.search(key);
        }
        return null; // Not found
    }

    // Insert
    public void insert(int key) {
        if (key < data) {
            if (left == null) {
                left = new BinarySearchTreeNode(key);
            } else {
                left.insert(key);
            }
        } else if (key > data) {
            if (right == null) {
                right = new BinarySearchTreeNode(key);
            } else {
                right.insert(key);
            }
        }
    }

    // Remove
    public BinarySearchTreeNode remove(int key) {
        return null;
    }

    // Pre-order traversal
    public void preOrderTraversal() {
        System.out.print(data + " ");
        if (left != null) {
            left.preOrderTraversal();
        }
        if (right != null) {
            right.preOrderTraversal();
        }
    }

    // In-order traversal
    public void inOrderTraversal() {
        if (left != null) {
            left.inOrderTraversal();
        }
        System.out.print(data + " ");
        if (right != null) {
            right.inOrderTraversal();
        }
    }

    // Post-order traversal
    public void postOrderTraversal() {
        if (left != null) {
            left.postOrderTraversal();
        }
        if (right != null) {
            right.postOrderTraversal();
        }
        System.out.print(data + " ");
    }

}
