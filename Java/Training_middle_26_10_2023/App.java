package Training_middle_26_10_2023;

public class App {
    public static void main(String[] args) throws Exception {
        BubbleSort buleSort = new BubbleSort();
        int[] arr = { 3, 8, 4, 9, 1, 2 };
        int n = arr.length;
        System.out.print("Mang ban dau: ");
        buleSort.displayArray(arr);
        // Sắp xếp mảng bằng Bubble Sort
        buleSort.bubbleSort(arr);
        // Hiển thị mảng đã sắp xếp
        System.out.print("Mang da  duoc sap xep: ");
        buleSort.displayArray(arr);
    }

}
