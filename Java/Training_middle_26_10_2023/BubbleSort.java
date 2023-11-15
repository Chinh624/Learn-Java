package Training_middle_26_10_2023;

public class BubbleSort {
     // Phần 1: Sắp xếp mảng bằng Bubble Sort
     public static void bubbleSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] < arr[j + 1]) {
                    // Hoán đổi hai phần tử nếu thứ tự sai
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    // Hiển thị mảng sau mỗi lần hoán đổi
                    displayArray(arr);
                }
            }
        }
    }
    // sắp xếp theo thứ tự tăng dần

    public static void insertionSort(int[] arr) {
        int n = arr.length;
        for (int i = 1; i < n; i++) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = key;
        }
    }

    // Phần 2: Hiển thị mảng
    public static void displayArray(int[] arr) {
        for (int i : arr) {
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
       