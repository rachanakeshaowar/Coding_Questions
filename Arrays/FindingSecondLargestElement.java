import java.util.Scanner ;
public class FindingSecondLargestElement {
    static int findMax(int [] arr){
        int mx =Integer.MIN_VALUE;
        for(int i =0;i<arr.length ;i++){
            if(arr[i] > mx){
                mx =arr[i];
            }
        }
        return mx;
    }

    static int findSecondMax(int [] arr){
        int mx =findMax(arr);
        for(int i=0;i<arr.length ;i++){
            if(arr[i] == mx){
                arr[i]=Integer.MIN_VALUE;

            }
        }
        int secondMax = findMax (arr);
        return secondMax ;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("second maximum element :" + findSecondMax(arr));
    }
}
