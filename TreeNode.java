import Tree.BinarySearchTreeNode;

public class TreeNode {
    private int data;
    private TreeNode left;
    private TreeNode right;



    public TreeNode(int data){
        this.data = data;
        this.left = null;
        this.right = null;

    }

    public void insert(int key){
       if(data < key){
          if(left == null){
            left = new TreeNode(key);
          }else{
            left.insert(key);
          }
    }else if(data > key){
        if(right ==  null){
            right = new TreeNode(key);
        }else{
            right.insert(key);
        }
    }
}


    public TreeNode search(int key){
        if (key == data){ 
            return this;
        }else if(data < key && left != null){
            left.search(key);
        }else if(data > key && right != null){
            right.search(key);
        }
        return null;
    }


    public void PreOrder(){
        System.out.printf(data + " ");
        if (left != null) {
            left.PreOrder();
        }
        if (right != null) {
            right.PreOrder();
        }
    }

    public void InOrder(){
        if(left != null) {
            left.InOrder();
        }
        System.out.printf(data + " ");
        if(right != null) {
            right.InOrder();
        }
    }

    public void PostOrder(){
        if(left != null) {
            left.PostOrder();
        }
        if(right != null) {
            right.PostOrder();
        }
        System.out.printf(data + " ");
    }


    public int countNode(){
        return countNodesRec(this);
    
    }

    private int countNodesRec(TreeNode root){
        if(root == null){
            return 0;
        }else{
            return 1 + countNodesRec(root.left) + countNodesRec(root.right);
        }
    }
    

    public void minNode() {
        TreeNode minNode = findMinNode(this);
        if (minNode != null) {
            System.out.println("Minimum Node: " + minNode.data);
        } else {
            System.out.println("Tree is empty.");
        }
    }

    private TreeNode findMinNode(TreeNode node){
        if (node == null) {
            return null;
        }
        while (node.left != null) {
            node = node.left;
        }
        return node;
    }

    public void maxNode() {
        TreeNode maxNode = findMaxNode(this);
        if(maxNode != null) {
            System.out.println("Maximum Node: " + maxNode.data);
        }else{
            System.out.println("Tree is empty.");
        }
    }

    private TreeNode findMaxNode(TreeNode node){
        if (node == null) {
            return null;
    }
    while (node.right != null) {
        return node.right;

    }
    return node;
}
    }
    