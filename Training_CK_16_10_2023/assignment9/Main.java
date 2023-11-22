package Training_CK_16_10_2023.assignment9;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        Stack<Integer> s = new Stack<>();
        int x = 3;
        int y = 5;
        int z = 2;
        s.clear();
        s.push(x);
        s.push(4);
        s.pop();
        s.push(y);
        s.push(3);
        s.push(z);
        s.pop();
        s.push(2);
        s.push(x);
        while (!s.isEmpty())
            System.out.println(s.pop() + " ");

    }
}
