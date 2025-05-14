public class InsersionSort {
    static void insertionSort(int[] a){
        int n =a.length;
//        why this loop starts from 1 as we assumed that 1 st element is already part of sorted array
        // here we are also using variable j which will traverse the array and will compare  at index j and at index j-1 and will sort the array
        for(int i=1;i<n;i++){
            int j=i;
            while(j>0 && a[j]<a[j-1]){
                // swap a[j] ,a[j-1]
                int temp=a[j];
                a[j]=a[j-1];
                a[j-1]=temp;
                j--;
                }

        }
    }
    public static void main(String[] args) {
        int[] a={1,12,3,4,10,6};
        insertionSort(a);
        for(int val :a){
            System.out.println(val+" ");
        }
    }
    // Take one element iterate through the sorted and find the correct position of this element
}
// best case o(n) and worst case o(n^2)
// space complexity o(1) as we inpalcely sorted array
// insertion sort is stable algorithm


