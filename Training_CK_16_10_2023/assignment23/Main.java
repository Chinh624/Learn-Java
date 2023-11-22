package Training_CK_16_10_2023.assignment23;

public class Main {
    static int recursiveBinarySearch(int[] arr, int start, int end, int value) {
        if (start == end) {
            return -1;
        }
        int midPoint = (start + end) / 2;
        // System.out.println(arr[midPoint]);
        if (value == arr[midPoint]) {
            return midPoint;
        }
        if (value > arr[midPoint]) {
            return recursiveBinarySearch(arr, midPoint + 1, end,
                    value);
        } else {
            return recursiveBinarySearch(arr, start, midPoint,
                    value);
        }
    }

    // Vị trí
    static int searchBinary(int[] arr, int value) {
        int[] newArr = new int[arr.length];
        // lưu lại vị trí của mảng đề bài

        for (int i = 0; i < arr.length; i++) {
            newArr[i] = i;
        }
        // sorted mảng của vị trí và mảng của đề bài
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    swap(arr, i, j);
                    swap(newArr, i, j);
                }
            }
        }
        // trả về giá trị của mảng vị trí...
        int key = recursiveBinarySearch(arr, 0, arr.length, value);
        if (key == -1) {
            return key;
        } else {
            return newArr[recursiveBinarySearch(arr, 0,
                    arr.length, value)];
        }
    }

    static void swap(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    static void printArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(" " + array[i]);
        }
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] A = { 2, 7, 1, 0, 3, 9, 5, 11, 10, 8 };
        int check = searchBinary(A, 8);
        System.out.println("Value 8 has index: " + check);
    }

}
