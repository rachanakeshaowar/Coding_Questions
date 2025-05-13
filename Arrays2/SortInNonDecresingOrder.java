import java.util.Scanner;

public class SortInNonDecresingOrder{
    static void reverse(int [] arr){
        int i =0;int j=arr.length-1;
        while(i<j){
            swap(arr,i,j);
            i++;
            j--;
        }
    }
static  int[]  sortSquares(int[] arr) {
    int n = arr.length;
    int left = 0;
    int right = n - 1;
    int[] ans = new int[n];
    int k = 0;
    while (left <= right) {
        if (Math.abs(arr[left]) > Math.abs(arr[right])) {
            ans[k] = Math.abs(arr[left]) * Math.abs(arr[left]);
            k++; // no use of reverse function if we do k-- here
            left ++ ;
        }
     else  {
            ans[k] = (arr[right])*(arr[right]);
            k++;// no use of reverse function if we do k-- here
            // because we are filling array by backside
            right --;
        }

    }
    reverse(ans);
    return ans ;
}





    static  void  sortzeroAndone(int[] arr){
        int n = arr.length ;
        int  left =0;
        int right =n-1;

        // efficient approach
        while(left<right ){
            if((arr[left]%2)!=0 && (arr[right]%2)==0){
                swap(arr,left,right);
                left++;
                right--;
            }
            if((arr[left]%2)==0){
                left++;
            }
            if((arr[right]%2)!=0){
                right--;

            }
        }

    }

    static void swap(int [] arr , int i , int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }


    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        int n =sc.nextInt(); ;
        int [] arr= new int[n];
        for(int i=0;i<n ;i++){
            arr[i]=sc.nextInt();

        }

     int [] ans =sortSquares( arr);

        for(int i=0;i<n ;i++){
            System.out.print(ans[i]+" ");
        }

    }
}

