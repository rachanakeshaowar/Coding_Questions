public class SelectionSort
{
    static void selectionSort(int[] arr){
        int n=arr.length;
        for(int i =0;i<n-1;i++){//  i represent the  current index
// find the minimum element in unsorted part of array
            int min_index =i;
            for(int j =i+1;j<n ;j++){
                if(arr[j]< arr[min_index]){
                    min_index =j;
                }
            }
            // swap current element and minimum element --> current index i will have correct
            // a[min_index],a[i]
            if(min_index!=i) {
                int temp = arr[i];
                arr[i] = arr[min_index];
                arr[min_index] = temp;
            }


        }
    }
    public static void main(String[] args) {
        int []arr ={34,5,6,7,8,9};
        selectionSort(arr);
        for(int i=0;i<arr.length ;i++){
            System.out.println(arr[i] + " ");
        }
    }
}
// all cases complexity is n^2
// selection sort is unstable
// selection sort is inplace algorithm