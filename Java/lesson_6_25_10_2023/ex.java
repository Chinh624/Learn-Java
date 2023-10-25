package Buoi7_t5;
import java.util.Scanner;
public class ex {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("dsa");
        int number = sc.nextInt();

        System.out.println("" + factorialRecursive(number));
}

public static long factorialRecursive(int number){
        if (number == 1){
            return 1;
        }else{
            return number *1;
        }
    }
}
