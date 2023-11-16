public class SinglyLinkedList {
    private SingleNode head;
    private int size = 0;

    public void addFirst(int s) {
        SingleNode newSingly = new SingleNode(s);
        newSingly.setNext(head);
        head = newSingly;
        size++;
    }

    public boolean isEmpty() {
        return head == null;
    }

    public SingleNode removeFromFront() {
        if (isEmpty()) {
            return null;
        }
        SingleNode removeNode = head;
        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }

    public void printList() {
        SingleNode current = head;
        System.out.println("HEAD =>");
        while (current != null) {
            System.out.println("" + current);
            System.out.println("->");
            current = current.getNext();
        }
        System.out.println("NULL");
    }

    public int count() {
        return this.size;
    }
}