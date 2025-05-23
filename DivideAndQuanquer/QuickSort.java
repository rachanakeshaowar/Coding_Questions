import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] arr = {1, 2, 5, 3, 4, 5, 9};
        System.out.println(Arrays.toString(arr));
        sort(arr, 0, arr.length - 1);
        System.out.println(Arrays.toString(arr));
    }

    static void sort(int[] arr, int low, int high) {
        if (low >= high) {
            return;
        }
        int pivot = fix(arr, low, high);
        sort(arr, low, pivot - 1);
        sort(arr, pivot + 1, high);
    }

    static int fix(int[] arr, int si, int ei) {
        int item = arr[ei];
        int idx = si;
        for (int i = si; i < ei; i++) {
            if (arr[i] < item) {
                swap(arr, i, idx);
                idx++;
            }
        }
        swap(arr, ei, idx);
        return idx; // You were missing this line
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
