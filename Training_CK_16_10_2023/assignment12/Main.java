package Training_CK_16_10_2023.assignment12;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyQueue myQueue = new MyQueue(20);
        myQueue.enq(5);
        myQueue.enq(3);
        myQueue.deq();
        myQueue.enq(2);
        myQueue.enq(8);
        myQueue.deq();
        myQueue.enq(9);
        myQueue.enq(1);
        myQueue.deq();
        myQueue.enq(7);
        myQueue.enq(6);
        myQueue.deq();
        myQueue.deq();
        myQueue.enq(4);
        myQueue.deq();
        myQueue.deq();
        myQueue.printQueue();
    }

}
