package Buoi7_t5;
import java.util.Scanner;
public class example {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter N :");
        int n = sc.nextInt();

        System.out.println(tinhGiaithua(n));
    }

    public static long tinhGiaithua(int n) {
        long giai_thua = 1;
        if (n == 0 || n == 1) {
            return giai_thua;
        } else {
            for (int i = 1; i <= n; i++) {
                giai_thua *= i;
            }
            return giai_thua;
        }
    }


}

