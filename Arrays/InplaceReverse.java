import java.util.Scanner;
public class InplaceReverse {
    static void reverseArray(int[]arr) {

int n=arr.length ;
        for (int i = 0; i < n/2; i++) {
            int temp =arr[i];
            arr[i]=arr[n-(i+1)];
            arr[n-i-1]=temp;

        }

    }
    static void swapInArray(int[] arr,int i,int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static void ReverseArray(int[] arr){
        int i=0,j=arr.length -1 ;
        while(i<j){
            swapInArray(arr,i,j);
            i++;
            j--;
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

     for(int i=0;i< n;i++){
        arr[i]  =sc.nextInt();

     }
        reverseArray(arr);
        for(int i=0;i< n;i++) {
            System.out.println(arr[i] + " ");
        }

        ReverseArray(arr);
        for(int i=0;i< n;i++) {
            System.out.println(arr[i] + " ");
        }
        // two time reverse hoat aahe by two reverse methods

    }
}
