package Training_CK_16_10_2023.assignment18;

public class Main {
    public static int findsum(int[] array, int length) {
        if (length == 1)
            return array[0];
        return array[length - 1] + findsum(array, length - 1);
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] numbers = { 1, 2, 3, 8 };
        System.out.println(findsum(numbers, numbers.length));
    }

}
