package Training_CK_16_10_2023.assignment14;

import java.util.EmptyStackException;

public class MyQueue {
    public int[] queue;
    private int back = 0;
    private int front = 0;

    public MyQueue(int capacity) {
        queue = new int[capacity];
    }

    // insert
    public void enqueue(int e) {
        if (queue.length == back) {
            int[] newArray = new int[queue.length * 2];
            System.arraycopy(queue, 0, newArray, 0, queue.length);
            queue = newArray;
        }
        queue[back] = e;
        back++;
    }

    // remove or pop()
    public int dequeue() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        int e = queue[front];
        queue[front] = 0;
        front++;
        if (size() == 0) {
            front = 0;
            back = 0;
        }
        return e;
    }

    // peek()
    public int first() {

        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return queue[front];
    }

    // print
    public void printQueue() {
        for (int i = front; i < back; i++) {
            System.out.println("" + queue[i]);
        }
    }

    // back
    public void traverse() {
        for (int i = back; i >= front; i--) {
            System.out.println("" + queue[i]);
        }
    }

    // size()
    public int size() {
        return back - front;
    }

    // clear()
    public void clear() {
        for (int i = front; i < back; i++) {
            queue[i] = 0;
        }
        front = 0;
        back = 0;
    }

    // isEmpty
    public boolean isEmpty() {
        return size() == 0;
    }

    public int getBack() {
        return back;
    }

    public void setBack(int back) {
        this.back = back;
    }

    public int getFront() {
        return front;
    }

    public void setFront(int front) {
        this.front = front;
    }

}
