package Training_CK_16_10_2023.assignment26;

public class MainQuickSort {
    static int partition(int[] arr, int left, int right) {
        int i = left, j = right;
        int pivot = arr[(left + right) / 2];
        while (i <= j) {
            while (arr[i] < pivot) {
                i++;

            }
            while (arr[j] > pivot) {
                j--;
            }
            if (i <= j) {
                swap(arr, i, j);
                i++;
                j--;
            }
        }
        return i;
    }

    static void quickSort(int arr[], int left, int right) {
        if (left >= right) {
            return;
        } else {
            int index = partition(arr, left, right);
            if (left < index - 1) {
                quickSort(arr, left, index - 1);
            }
            if (index < right) {
                quickSort(arr, index, right);
            }
        }
    }

    static void swap(int[] arr, int a, int b) {
        if (a == b) {
            return;
        }
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }

    static void printArray(int[] array) {
        System.out.print("[");
        for (int i = 0; i < array.length; i++) {
            if (i == array.length - 1) {
                System.out.print(array[i]);

            } else {
                System.out.print(array[i] + ", ");
            }
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int[] array = { 22, 12, 9, 7, 31, 19, 2, 27 };
        System.out.println("Normally");
        printArray(array);
        System.out.println();
        System.out.println("After quick sort");
        quickSort(array, 0, array.length - 1);
        printArray(array);
    }

}
