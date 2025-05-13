import java.util.Scanner ;
public class TripletPairsTargetSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }

        int t = sc.nextInt();
        int ans = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++)
                for (int k = j+ 1; k < arr.length; k++)


                if (arr[i] + arr[j] + arr[k] == t) {

                    ans++;
                }


        }

        System.out.println(ans);

    }
}

