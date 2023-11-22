package Training_CK_16_10_2023.assignment14;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        MyQueue myQueue = new MyQueue(10);
        myQueue.enqueue(5);
        myQueue.enqueue(2);
        myQueue.enqueue(10);
        myQueue.enqueue(8);
        myQueue.enqueue(6);
        myQueue.printQueue();
        System.out.println();
        myQueue.traverse();
        System.out.println();
        System.out.println(myQueue.dequeue());
        myQueue.printQueue();
        System.out.println();
        myQueue.clear();
        myQueue.printQueue();
        System.out.println();
    }

}
