package Training_CK_16_10_2023.assignment17;

public class Main {
    public static int fibo(int n) {
        if (n <= 2)
            return 1;
        return fibo(n - 1) + fibo(n - 2);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        for (int i = 1; i <= 10; i++) {
            System.out.print(fibo(i) + " ");
        }
    }
}
