package Training_CK_16_10_2023.assignment25;

public class Main {
    static void BubbleSort(int[] arr) {
        int lastIndex = arr.length - 1;
        for (int last = lastIndex; last >= 0; last--) {
            for (int i = 0; i < last; i++) {
                if (arr[i] < arr[i + 1]) {
                    swap(arr, i, i + 1);
                }
            }
        }
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void swap(int[] arr, int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] intArray = { 3, 8, 4, 9, 1, 2 };
        System.out.println("Normally");
        printArray(intArray);
        System.out.println();
        System.out.println("After BubbleSort");
        BubbleSort(intArray);
        printArray(intArray);
    }

}
