package Training_CK_16_10_2023.assignment16;

public class Main {
    public static int fact(int n) {
        if (n <= 1)
            return 1;
        return n * fact(n - 1);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("5! = " + fact(5));
        System.out.println("10! = " + fact(10));
    }

}
