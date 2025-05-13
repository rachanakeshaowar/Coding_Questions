import java.util.Scanner;

public class ReversearrayMethod2 {


        static void  swap(int[]arr ,int i , int j) {


                int temp =arr[i];
                arr[i]=arr[j];
                arr[j]=temp;

            }


        static  void reverse(int[] arr ,int  i, int j) {
            while (i < j) {
                swap(arr, i, j);
                i++;
                j--;
            }
            }


        static int[] rotate(int[] arr,int k) {
            int n = arr.length;
            k = k % n;
            reverse(arr, 0, n - 1 - k);
            reverse(arr, n - k, n - 1);
            reverse(arr, 0, n - 1);


        return arr ;

        }
        static  void printArray(int [] arr){
            for(int i=0;i< arr.length;i++){
                System.out.println(arr[i]);
            }
            System.out.println(" ");
        }

        public static void main(String[] args) {
            Scanner sc =new Scanner(System.in);
            int n=sc.nextInt();
            int[] arr =new int[n];
            System.out.println("enter"+n+"elements");
            for(int i=0;i<n;i++){
                arr[i]=sc.nextInt();


            }
            System.out.println("K:");
            int  k = sc.nextInt();

            System.out.println(" array:");
            rotate(arr,k);
            printArray(arr);


        }


    }

//without using extra steps means without creating new array




