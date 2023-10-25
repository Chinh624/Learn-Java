package Buoi1_t5;

import java.util.Scanner;

public class newMain {

    public static boolean findElements(int[] a, int value) {
        boolean check = false;
        for (int i = 0; i < a.length; i++) {
            if (a[i] == value) {
                check = true;
            }
        }
        return check;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] myArr = { 1, 2, 3, 4, 5, 6 };
        String[] days = { "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday" };

        boolean answer = findElements(myArr, 5);
        System.out.println("Find this element: " + answer);

        System.out.println("Enter a number: ");
        int num = in.nextInt();
        if (1 <= num && num <= 7) {
            System.out.println("" + days[num - 1]);
        } else {
            System.out.println("Invalid");
        }
        System.out.println("===========");

        for (String tempDay : days) {
            System.out.println("" + tempDay);
        }

        System.out.println("===========");

        for (int i = days.length - 1; i >= 0; i--) {
            System.out.println("" + days[i]);
        }
    }
}
