import java.util.Scanner;

public class SortAsPerEvenOdd {


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
        sortzeroAndone(arr);

        for(int i=0;i<n ;i++){
            System.out.println(arr[i]);
        }

    }
}
