import java.util.Scanner ;
public class ArrayManipulation {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }


        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j] && i != j) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                System.out.println(arr[i]);
            }

        }


    }
}
//import java.util.Scanner ;
// public class FindUnique{
// static int find_Unique(int [] arr){
//int n =arr.length;
// for(int i =0;i<n;i++){
// for(int j =i+1;j<n ;j++){
// if(arr[i] ==arr[j]){
//arr[i]=-1;
//arr[j]=-1;
//}
//}
//}
// int ans =-1;
//for(int i =0;i <n;i++){
//if(arr[i] > 0){
// ans = arr[i];
//}
//}
//return ans;
//}
//public static void main(String[] args) {
  //  Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        int[] arr = new int[n];
// for (int i = 0; i < arr.length; i++) {
//            arr[i] = sc.nextInt();
//
//        }
// System.out.println("unique" + findUnique(arr));
//}





