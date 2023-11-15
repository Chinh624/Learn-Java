package lesson_4_25_10_2023;

public class StudentList {
    private StudentNode head = null;
    private StudentNode tail = null;
    private int size = 0;

    public void insertAtHead(Student2 employee) {
        final StudentNode newNode = new StudentNode(employee);

        if (head == null) {
            tail = newNode;
        } else {
            head.setPrevious(newNode);
            newNode.setNext(head);
        }
        head = newNode;
        size++;
    }

    public void insertAtTail(Student2 Student) {
        StudentNode newNode = new StudentNode(Student);

        if (tail == null) {
            head = newNode;
        } else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
        }
        tail = newNode;
        size++;
    }

    public StudentNode removeFromHead() {
        if (isEmpty()) {
            return null;
        }
        StudentNode removedNode = head;

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
        StudentNode current = head;
        System.out.print("HEAD -> ");
        while (current != null) {
            System.out.println("" + current);
            System.out.println(" <- -> ");
            current = current.getNext();
        }
        System.out.println("NULL");
    }

    public StudentNode removeFromEnd() {
        if (isEmpty()) {
            return null;
        }
        StudentNode removedNode = tail;

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
