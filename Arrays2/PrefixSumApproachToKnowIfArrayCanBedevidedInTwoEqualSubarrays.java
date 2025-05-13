import java.util.Scanner;

public class PrefixSumApproachToKnowIfArrayCanBedevidedInTwoEqualSubarrays {
    // method 2 
    static boolean equalSumPartition(int[] arr){
        int totalsum =0;
        Scanner sc = new Scanner(System.in);
        int n=arr.length ;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            totalsum =totalsum + arr[i];
        }
        int prefixSum =0 ;

        for (int i = 0; i < n-1; i++) {
            prefixSum = prefixSum + arr[i];
            int  suffixSum = totalsum - prefixSum;
            if(prefixSum==suffixSum){
               return true;
            }
        }
        //  not understood why loop is till n-2
        return false;

    }
    // method 1

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter the n :");
        int n = sc.nextInt();
        int[] arr = new int[n];
        int totalsum =0;
        System.out.println("eneter " + n + "elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
  totalsum =totalsum + arr[i];
        }
int prefixSum =0 ;
        boolean canDivide =false;
        for (int i = 0; i < n-1; i++) {
          prefixSum = prefixSum + arr[i];
        int  suffixSum = totalsum - prefixSum;
           if(prefixSum==suffixSum){
               canDivide=true;
               break;
           }
 }
        if(canDivide){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
// we can also solve this question using only prefix sum