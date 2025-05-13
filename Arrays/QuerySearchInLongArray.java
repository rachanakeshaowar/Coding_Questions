import java.util.Scanner ;
public class QuerySearchInLongArray {
    static int [] makeFrequencyArray(int[] arr){
        int[] freq =new int[10005];
        for(int i=0 ;i<arr.length;i++){
            freq[arr[i]]++;

        }
        return freq;
    }

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("eneter array size :");
      int n =sc.nextInt();
      int[] arr =new int[n];
        System.out.println("enter "+n+"elements ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        int [] freq =makeFrequencyArray(arr);
        System.out.println("eneter number of queries :");
        int q =sc.nextInt();
        while(q>0){
            System.out.println("eneter number to be searched :");
            int x=sc.nextInt();
            if(freq[x]>0){
    System.out.println("YES");

}
else{
    System.out.println("NO");
}
            q--;

        }


    }

}
