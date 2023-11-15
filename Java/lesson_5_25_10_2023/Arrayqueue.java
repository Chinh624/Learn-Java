package lesson_5_25_10_2023;
import java.util.NoSuchElementException;

public class Arrayqueue {
    private Employee[] queue;
    private int front;
    private int back;


public void ArrayQueue(int capacity){
    queue = new Employee[capacity];
}

public void add ( Employee employee){
    if(back == queue.length){
        Employee[] newArray = new Employee[2 * queue.length];
        System.arraycopy(queue, 0, newArray, 0, queue.length);
        queue = newArray;
}
        queue[back] = employee;
        back++;
}   
/**
 * @return
 */
public Employee remove(){
    if(size() == 0){
        throw new NoSuchElementException();
    }
    Employee employee = queue[front];
    queue[front] = null;
    front ++;
    if (size() ==0 ){
        front = 0;
        back = 0;
    }
    return employee;
}
    private int size() {
        return back - front;
    }

public Employee Peek(){
    if (size() == 0){
        throw new NoSuchElementException();
    }
    return queue[front];
}

public void printQueue() {
    for (int i = front; i < back; i++) {
        System.out.println(queue[i]);
    }
}


}
