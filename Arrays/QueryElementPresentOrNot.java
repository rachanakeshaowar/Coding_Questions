import java.util.Scanner ;
public class QueryElementPresentOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("enter no. of query :");
        double[] arr_2 = new double[100001];
        for (int i = 0; i < arr.length; i++) {
            arr_2[arr[i]]++;
        }
        int k;
        k = sc.nextInt();
        System.out.println("which element to search :");
        // here we are taking input of k no. of queries to search each
        for (int j = 0; j < k; j++) {
            int query = sc.nextInt();
            if (arr_2[query] != 0) {
                System.out.println("Yes");
            }
        }
        System.out.println("No");
    }
}




