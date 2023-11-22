package Training_CK_16_10_2023.assignment22;

public class Main {
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

}
