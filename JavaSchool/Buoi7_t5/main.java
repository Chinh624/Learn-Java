package Buoi7_t5;
import java.util.Scanner;

public class main {
    public static void main(String[] args){
        long resultbyInterative , resultByrecursive;
        resultbyInterative = factorialIterative(5);
        System.out.println("Result by interval: " + resultbyInterative);
        resultByrecursive = factorialRecursive(5);
        System.out.println("result by recursive: " + resultByrecursive);
    }
private static long factorialRecursive(int number) {
        if (number == 1){
            return 1;
        }else{
            return number * factorialIterative(number - 1);
        }
    }

private static long factorialIterative(int number) {
        long rs = 1;
        for (int i = 2; i<= number ; i++){
            rs = rs * i;
    }
        return rs;
}
    public int enterPositive(){
            Scanner input = new Scanner(System.in);
            int tmp;
            do {
                
                System.out.println("Enter number");
                tmp = input.nextInt();
            }while (tmp <= 0);
                return tmp;
        }
}

