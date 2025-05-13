import java.util.Scanner ;
public class ReverseArrayByKsteps2 {
    static int[] rotate(int[] arr,int k){
        int n =arr.length;
        k=k%n;
        int[] ans =new int[n];
      int j=0;
      for(int i=n-k;i<n;i++){
          ans[j++]=arr[i];
      }

//        For an input array arr = [1, 2, 3, 4, 5] and k = 2:
//
//        n = 5, k = k % n = 2.
//        The first loop picks the last 2 elements (4, 5) and places them at the beginning of ans.
//        After the first loop, ans = [4, 5, _, _, _].
//        The second loop picks the first 3 elements (1, 2, 3) and places them in ans after the last k elements.
//        After the second loop, ans = [4, 5, 1, 2, 3].
//        The method returns ans = [4, 5, 1, 2, 3].
      for(int i =0;i<n-k;i++){
          ans[j++]=arr[i];
      }
        return ans ;
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
        System.out.println("original array:");
        printArray(arr);
        int [] ans =rotate(arr,k);
        System.out.println("after rotation:");
        printArray(ans);

    }


}
//without using extra steps means without creating new array
