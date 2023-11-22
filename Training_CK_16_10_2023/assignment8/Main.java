package Training_CK_16_10_2023.assignment8;

import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class Main {
    public static void reseverStack(int number) {
        MyStack stack = new MyStack(20);
        System.out.print(number + " So dao nguoc (Stack) : ");
        while (number > 0) {
            stack.push(new Integer(number % 10));
            number = number / 10;
            System.out.print(stack.pop());
        }
    }

    public static void reseverQueue(int number) {
        Queue<Integer> N = new PriorityQueue<Integer>();
        System.out.print(number + " So dao nguoc (Hang Doi) : ");
        while (number > 0) {
            N.add(new Integer(number % 10));
            number = number / 10;
            System.out.print(N.peek());
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        reseverStack(1234567);
        System.out.println();
        reseverQueue(1234567);
    }

}
