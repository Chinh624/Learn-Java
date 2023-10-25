package BKTGK;

public class Node {
    private Animal data;
    private Node next;

    public Node(Animal data) {
        this.data = data;
        this.next = null;
    }

    public Animal getData() {
        return data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
    
}
