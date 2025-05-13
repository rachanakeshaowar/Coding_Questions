import java.util.Scanner ;
public class RotataeByKstepsNoUsingExtraSpace {
    static void reverseArray(int[]arr) {

        int n=arr.length ;
        for (int i = 0; i < n/2; i++) {
            int temp =arr[i];
            arr[i]=arr[n-(i+1)];
            arr[n-i-1]=temp;

        }

    }

        static int[] rotate(int[] arr,int k){
            int n =arr.length;
            k=k%n;


            for(int i=n-k;i<n;i++){
                reverseArray(arr);
            }
            for(int i =0;i<n-k;i++){
                reverseArray(arr);
            }
            for(int i=0;i<n;i++){
                reverseArray(arr);
            }
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


