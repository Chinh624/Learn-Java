package Buoi3_t5;

public class EmployeeDoublyLinkedList {
    private EmployeeNode head = null;
    private EmployeeNode tail = null;
    private int size = 0;

    public void insertAtHead(Employee employee) {
        EmployeeNode newNode = new EmployeeNode(employee);

        if (head == null) {
            tail = newNode;
        } else {
            head.setPrevious(newNode);
            newNode.setNext(head);
        }
        head = newNode;
        size++;
    }

    public void insertAtTail(Employee employee) {
        EmployeeNode newNode = new EmployeeNode(employee);

        if (tail == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
        }
        tail = newNode;
        size++;
    }

    public EmployeeNode removeFromHead() {
        if (isEmpty()) {
            return null;
        }
        EmployeeNode removedNode = head;

        if (head.getNext() == null) {
            tail = null;
        } else {
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        size--;
        removedNode.setNext(null);
        return removedNode;
    }

    public void printList() {
        EmployeeNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.println("" + current);
            System.out.println(" <- -> ");
            current = current.getNext();
        }
        System.out.println("NULL");
    }

    public EmployeeNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }
        EmployeeNode removedNode = tail;

        if (tail.getPrevious() == null) {
            head = null;
        } else {
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        removedNode.setPrevious(null);
        return removedNode;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
