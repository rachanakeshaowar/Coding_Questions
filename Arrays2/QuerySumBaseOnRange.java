import java.util.Scanner ;
public class QuerySumBaseOnRange {
    static int [] PrefixSum(int[] arr){
       int  n=arr.length;
       int[] pref=new int[n+1];
       // here we have used n+1 as first 0 elemment sum is 0 so one extra space required for this
       pref[0]=0;
       for(int i = 1;i<=n;i++){
           pref[i]=pref[i-1]+arr[i-1];
       }

       return pref;
    }
//my method
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("eneter the n :");

        int n =sc.nextInt();

        int[] arr =new int[n];




        System.out.println("eneter "+ n + "elements");
        for(int i=1 ;i<=n;i++){
            arr[i]=sc.nextInt();

        }
        int[] pref =PrefixSum(arr);
        System.out.println("enter no. of queries :");
        int q= sc.nextInt();
        while(q>0){
            System.out.println("enter range l and r:");
            int left =sc.nextInt();
            int right =sc.nextInt();
         int sum =pref[right]-pref[left-1];
            System.out.println(sum);
            q--;
        }
        //  int[] pref=  makePrefixSumArray ( arr);


    }
}
