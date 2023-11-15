package Training_middle_26_10_2023;

public class main {
            public static void main(String[] args) {
                BubbleSort bubleSort = new BubbleSort();
                int[] arr = { 3, 8, 4, 9, 1, 2 };
                int n = arr.length;
                System.out.print("Mang ban dau: ");
                bubleSort.displayArray(arr);
                // sắp xếp mảng bằng
                bubleSort.insertionSort(arr);
                //
                System.out.print("Mang da  duoc sap xep: ");
                bubleSort.displayArray(arr);
            }
        }
