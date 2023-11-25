package Main;

import java.util.Scanner;

public class SinglyLinkedList {
    private static Scanner scanner = new Scanner(System.in);
    private Node head;

    // Constructor
    public SinglyLinkedList() {
        this.head = null;
    }

    // Hàm thêm một node với data x vào đầu danh sách liên kết
    public void addFirst(int x) {
        // tao mot doi tuong newnode khi them vao no se tro den vi tri dau tien va tro
        // thanh node dau tien
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
    }

    // Hàm xóa một node đầu danh sách và trả về giá trị node xóa
    public Node removeFromFront() {
        if (head == null) {
            // neu khong co node nao thi no tra ve
            System.err.println("Danh sach lien ket rong.");
            return null;
        }
        // tro ve node dau tien sau do xoa
        Node removedNode = head;

        head = head.next;

        removedNode.next = null;
        return removedNode;
    }

    // Hàm đếm số lượng phần tử trong danh sách
    public int count() {
        int count = 0;
        Node current = head;

        while (current != null) {
            count++;
            current = current.next;
        }

        return count;
    }

    // Hàm in ra data của tất cả các node trong danh sách
    public void printList() {
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }

        System.out.println();
    }

    // in ra vi tri cac node
    public void printListWithPositions() {
        Node current = head;
        int position = 0;

        while (current != null) {
            System.out.println("Vị trí " + position + ": " + current.data);
            current = current.next;
            position++;
        }
    }

    // lay node
    public Node getNode(int x) {
        Node current = head;

        while (current != null) {
            if (current.data == x) {
                return current;
            }
            current = current.next;
        }
        System.err.println("Không tìm thấy node có giá trị " + x);
        return null;
    }

    public int getPosition(Node node) {
        Node current = head;
        int position = 0;

        while (current != null) {
            if (current == node) {
                return position;
            }
            current = current.next;
            position++;
        }

        System.err.println("Không tìm thấy node trong danh sách.");
        return -1;
    }

    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();

        myList.addFirst(10);
        myList.addFirst(120);
        myList.addFirst(130);
        myList.addFirst(110);

        System.out.print("Danh sach ban dau: ");
        myList.printList();

        System.out.println("So luong phan tu trong danh sach: " + myList.count());

        Node removedNode = myList.removeFromFront();
        if (removedNode != null) {
            System.out.println("Node bi xoa: " + removedNode.data);
        }

        Node searchedNodeIndex = myList.getNode(10);
        Node searchedNode = myList.getNode(10);

        if (searchedNode != null) {
            System.out.println("Gia tri tim la: " + searchedNode.data);
        }

        if (searchedNodeIndex != null) {
            System.out.println(
                    "Node được tìm thấy tại vị trí: " + myList.getPosition(searchedNodeIndex));
        }

        System.out.print("Danh sach sau khi xoa mot node: ");
        myList.printList();

        myList.printListWithPositions();

    }
}
