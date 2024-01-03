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
        return null;
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

    public void reverse() {
        if (right != null) {
            right.reverse();
        }
        System.out.print(data + " ");
        if (left != null) {
            left.reverse();
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

    // Count nodes
    public int countNodes() {
        return countNodesRec(this);
    }

    private int countNodesRec(BinarySearchTreeNode root) {
        if (root == null) {
            return 0;
        }
        return 1 + countNodesRec(root.left) + countNodesRec(root.right);
    }

    public void minNode() {
        BinarySearchTreeNode minNode = findMinNode(this);
        if (minNode != null) {
            System.out.println("Minimum Node: " + minNode.data);
        } else {
            System.out.println("Tree is empty.");
        }
    }

    private BinarySearchTreeNode findMinNode(BinarySearchTreeNode node) {
        if (node == null) {
            return null;
        }
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public void maxNode() {
        BinarySearchTreeNode maxNode = findMaxNode(this);
        if (maxNode != null) {
            System.out.println("Maximum Node: " + maxNode.data);
        } else {
            System.out.println("Tree is empty.");
        }
    }

    private BinarySearchTreeNode findMaxNode(BinarySearchTreeNode node) {
        if (node == null) {
            return null;
        }
        while (node.right != null) {
            node = node.right;
        }
        return node;
    }

}
