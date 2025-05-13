import java.util.Scanner;

public class QuerySumRange {


    // here we have made new array

    static int [] makePrefixSumArray (int[] arr){
        int n =arr.length;
        int[] pref =new int[n+1];
        pref[0]=0;

        for(int i=1;i<=n;i++){
            pref[i]=pref[i-1]+arr[i-1];


        }
        return pref;

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
        System.out.println("enter query :");
        int q=sc.nextInt();
        int[] pref=  makePrefixSumArray ( arr);
        for(int i=1;i<=n;i++){
            System.out.println(pref[i]);

        }
        while(q>0){
            System.out.println("enter range l and r:");
            int left =sc.nextInt();
            int right =sc.nextInt();
         int sum = pref[right]-pref[left-1];
         // -1 because we have to include left index in sum and subtract sum till left-1 from sum till right index
            System.out.println("sum is " +sum);

            q--;
        }




    }
}
