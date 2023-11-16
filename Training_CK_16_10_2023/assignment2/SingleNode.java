public class SingleNode {
    private int singly;
    private SingleNode next;

    public SingleNode(int singly) {
        this.singly = singly;
    }

    public int getSingly() {
        return singly;
    }

    public void setSingly(int singly) {
        this.singly = singly;
    }

    public SingleNode getNext() {
        return next;
    }

    public void setNext(SingleNode next) {
        this.next = next;
    }

@Override
public String toString() {
return "SinglyNode [singly=" + singly + "]";
}
}