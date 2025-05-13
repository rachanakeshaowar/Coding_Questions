import java.util.Scanner;
// means we have to calculate prefix and suffix sum and check if they are equal
public class DevideSubarrayIntwoEqualArray {


    // here we have made new array

    static int[] makePrefixSumArray(int[] arr) {
        int n = arr.length;
        int[] pref = new int[n];
        pref[0] = arr[0];

        for (int i = 1; i < n; i++) {
            pref[i] = pref[i - 1] + arr[i];


        }
        return pref;

    }

    static int[] makeSuffixSumArray(int[] arr) {
        int n = arr.length;
        int[] suff = new int[n];
        suff[n - 1] = arr[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            suff[i] = suff[i + 1] + arr[i];


        }
        return suff;

    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("eneter the n :");

        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("eneter " + n + "elements");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();

        }
        int[] pref = makePrefixSumArray(arr);
        int[] suff = makeSuffixSumArray(arr);

        for (int i = 0; i < n; i++) {
            System.out.println(pref[i]);

        }
        for (int i = 0; i < n; i++) {
            System.out.println(suff[i]);

        }
//        int j=0;
//        for(int i=1 ;i<n-1;i++) {
//        if(pref[i]==suff[j]){
//            System.out.println("Yes we can partision array in two subarrays with equal sum");
//            j++;
//        }
//        else{
//            System.out.println("No partition");
//        }
//        }
// above logic is not totally correct but
        boolean candivide=false;
        for (int i = 0; i <= n-2; i++) {
            // <= n-2 because we will compare last element of prefix array
            // with last +1 element of suffix array which element we not have so compare till n-2 only
            //means if i=n-2 then i+1 will be n-1 which is there in suffix array
            if (pref[i] == suff[i + 1]) {
candivide=true;
break;
            }
        }
        if(candivide==true){
            System.out.println("Yes can be divided in two subarrys with equal sum ");
        }
        else{
            System.out.println("No");
        }
    }
}
// we can also solve this question using only prefix sum