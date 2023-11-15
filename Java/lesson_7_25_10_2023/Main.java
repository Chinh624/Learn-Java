package lesson_7_25_10_2023;
public class Main {
    public static void main(String[] args) {
        Tree intTree = new Tree();
        intTree.insert(25);
        intTree.insert(20);
        intTree.insert(15);
        intTree.insert(27);
        intTree.insert(30);
        intTree.insert(29);
        intTree.insert(26);
        intTree.insert(22);
        intTree.insert(32);
        intTree.insert(17);

        // In ra các giá trị trong cây theo thứ tự InOrder và PreOrder
        System.out.print("InOrder Traversal: ");
        intTree.traverseInOrder();
        System.out.println();

        System.out.print("PreOrder Traversal: ");
        intTree.traversePreOrder();
        System.out.println();

        // In ra giá trị nhỏ nhất và lớn nhất trong cây
        System.out.println("Min Value: " + intTree.min());
        System.out.println("Max Value: " + intTree.max());
    }
}
        
