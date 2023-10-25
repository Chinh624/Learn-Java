package Buoi1_t5;

import java.util.Scanner;

public class Bai2 {
    private static final Scanner sc = new Scanner(System.in);

    private static int checkInputInt() {
        while (true) {
            try {
                int result = Integer.parseInt(sc.nextLine().trim());
                return result;
            } catch (NumberFormatException e) {
                System.err.println("Please input number");
                System.out.print("Enter again: ");
            }
        }
    }

    private static int inputSizeOfArray() {
        System.out.print("Enter number of array:");
        int n = checkInputInt();
        return n;
    }

    private static int[] inputValueOfArray(int n) {
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print("Enter a[" + i + "]: ");
            a[i] = checkInputInt();
        }
        return a;
    }

    // private static void swap(int a, int b) {
    // int temp = a;
    // a = b;
    // b = temp;
    // System.out.println("helllo");
    // }

    private static void sortArrayByBubbleSort(int[] a) {
        System.out.print("Unsorted array:");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i] + "");
        }
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - i - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = temp;
                }
            }
            System.out.println();
        }
    }

    private static void print(int[] a) {
        System.out.print("Sorted array:");
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int n = inputSizeOfArray();
        int[] a = inputValueOfArray(n);
        sortArrayByBubbleSort(a);
        print(a);
    }
}
