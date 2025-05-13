import java.util.Scanner;
public class SortArraysOf0sAnd1s {
    static  void  sortzeroAndone(int[] arr){
        int n = arr.length ;
       int  left =0;
       int right =n-1;
       // efficient approach
       while(left<right ){
           if(arr[left]==1 && arr[right]==0){
               swap(arr,left,right);
               left++;
               right--;
           }
           if(arr[left]==0){
               left++;
           }
           if(arr[right]==1){
               right--;

           }
       }

    }

    static void swap(int [] arr , int i , int j){
        int temp =arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }
    static int [] Sort(int[] arr){
        int  [] ans =new int[arr.length];
        int j=0;
        for(int i=0;i<arr.length ;i++) {
            if(arr[i]==0){
                ans[j]=arr[i];
                j++;}


            }
        for(int i=0;i<arr.length ;i++) {
            if (arr[i] == 1) {
                ans[j] = 1;
                j++;
            }
        }
        return ans;

   }
   static void sortZeroesAndOnes(int[] arr){
        int  n=arr.length ;
        int zeroes =0;
        // count number of arrays
        for(int i=0;i<n;i++) {
            if (arr[i] == 0) {
                zeroes++;
            }
        }
            for (int i = 0; i < zeroes; i++) {
                {
                    arr[i] = 0;
                }
            }
            for (int i = zeroes ; i < n; i++) {
                {
                    arr[i] = 1;
                }


                // 0 to zeroes-1 : 0,zeroes to n-1 : 1
            }

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
