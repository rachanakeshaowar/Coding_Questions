public class MergeArray2 {
    public static void main(String[] args) {
        int[] arr1 = {1, 3, 5, 7};
        int[] arr2 = {2, 4, 6, 8, 10};
        int[] arr = merge(arr1, arr2);
        print(arr);

    }
    static void print(int[] arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    static int[] merge(int[] arr1, int[] arr2) {
        int[] arr = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] < arr2[j]) {
                arr[k] = arr1[i];
                i++;
            } else {
                arr[k] = arr2[j];
                j++;
            }
            k++;
        }

        while (i < arr1.length) {
            arr[k] = arr1[i];
            k++;
            i++;
        }
        while (j < arr2.length) {
            arr[k] = arr2[j];
            k++;
            j++;
        }
        return arr;
    }
}
