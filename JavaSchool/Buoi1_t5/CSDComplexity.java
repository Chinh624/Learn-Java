package Buoi1_t5;

import java.util.Scanner;

public class CSDComplexity {
    private static final Scanner sc = new Scanner(System.in);

    boolean contains(int[] numbers, int number) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == number) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        CSDComplexity obj = new CSDComplexity();
        int[] numbers = { 1, 2, 99, 5, 32, 4 };
        int number = 4;
        long start = System.nanoTime();
        obj.contains(numbers, number);
        long end = System.nanoTime();
        long execution = end - start;
        System.out.println("Execution time: " + execution + " nanoseconds");
    }

}