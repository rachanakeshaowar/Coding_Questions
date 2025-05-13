import java.util.Scanner;
public class PrefixSum {
    // here we have made new array

    static int [] makePrefixSumArray (int[] arr){
        int n =arr.length;
        int[] pref =new int[n];
        pref[0]=arr[0];

        for(int i=1;i<n;i++){
            pref[i]=pref[i-1]+arr[i];


        }
        return pref;

    }
    static int [] withoutUsingNewArrayPrefixSumArray (int[] arr){
        int n =arr.length;
// here we not made new array

        for(int i=1;i<n;i++){
           arr[i]=arr[i-1]+arr[i];


        }
        return arr;

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("eneter the n :");

        int n =sc.nextInt();
        int[] arr =new int[n];

        System.out.println("eneter "+ n + "elements");
        for(int i=0 ;i<n;i++){
            arr[i]=sc.nextInt();

        }
  //  int[] pref=  makePrefixSumArray ( arr);
        withoutUsingNewArrayPrefixSumArray ( arr);
        for(int i=0 ;i<n;i++){
            System.out.println(arr[i]);

        }

    }
}
