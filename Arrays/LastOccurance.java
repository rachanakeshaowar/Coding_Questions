import java.util.Scanner;

public class LastOccurance {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        int occ =0;
        for(int i =0;i<arr.length;i++){
            arr[i] = sc.nextInt();


        }
        System.out.println("enter number to check occurence occ:");
        int   ans = sc.nextInt();
        int i;
        int lastIndex =-1;


        for( i =0;i<arr.length;i++){
            if(arr[i]==ans){
                occ ++;
                lastIndex = i;



            }


        }

        System.out.println(" no. of occurences");

        System.out.println(occ);
        System.out.println("last occured index");
        System.out.println(lastIndex);


    }
}
