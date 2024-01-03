
public class main {
    public static void main(String[] args) {
        TreeNode root = new TreeNode(16);

        int[] arr = { 12, 23, 43, 5, 43, 3, 16 };
        for (int i : arr) {
            root.insert(i);
        }
        System.out.println();
        root.PreOrder();
        System.out.println();

        root.InOrder();
        System.out.println();

        root.PostOrder();
        System.out.println();

        int number = root.countNode();
        System.out.println(number);

        root.minNode();
        root.maxNode();
        int findnode = 113;
        TreeNode searchh = root.search(findnode);
        if (searchh != null) {
            System.out.println(findnode);
        } else {
            System.out.println("empty search" + findnode);
        }

    }

}
