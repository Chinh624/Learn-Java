package Training_CK_16_10_2023.assignment19;

public class Main {

    static boolean isPalindrome(char c[], int n) {
        if (n == 1) {
            return true;
        }
        int m = c.length;
        if (c[n - 1] != c[m - n]) {
            return false;
        } else {
            return isPalindrome(c, n - 1);
        }
    }

    public static void main(String[] args) {
        char[] n = { 'a', 'b', 'c', 'c', 'b', 'a' };
        boolean check = isPalindrome(n, n.length);
        if (check) {
            System.out.println("is Palindrome");
        } else {
            System.out.println("is not Palindrome");
        }
    }
}
