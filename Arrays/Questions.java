import java.util.Scanner ;
import java.util.Arrays ;
public class Questions {


    static int[] smallestAndLargestElement(int[] arr) {
        Arrays.sort(arr);
        // int[] ans ={ arr[0] , arr[arr.length-1]};
        // return ans ;
        int[] arr_1 = new int[2];


         arr_1[0]=arr[0];
        arr_1[1]=arr[arr.length-1];
return arr_1 ;



    }




    static boolean  isSorted(int[] arr ){
        boolean check = false;
        for(int i =0;i< arr.length;i++){
            if(arr[i]<arr[i+1]){
                check = true;
            }
            break;
        }
        return check ;
    }
    static int lastOccurrence(int[] arr ,int x){
        int lastIndex =-1;
        for(int i =0;i< arr.length;i++){
            if(arr[i]==x){
                lastIndex =i ;
            }
        }
        return lastIndex ;

    }
    static int countOccurrences(int[] arr ,int x){
        int count =0 ;
        for(int i=0;i<arr.length ;i++){
            if(arr[i] ==x){
                count ++ ;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);

        System.out.println("eneter size of array :");
        int n= sc.nextInt();
        int[] arr = new int[n];
        System.out.println("enter "+ n + "elements :");
        for(int i =0 ;i< arr.length ;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("enter x: ");
        int x =sc.nextInt();
        boolean sorted = false;
        System.out.println("count of x :" + countOccurrences(arr,x));
        System.out.println("last occurrence of x :" +lastOccurrence(arr,x));
        System.out.println("array is sorted  : "+isSorted(arr) );

        // int[] ans =smallestAndLargestElement(arr);
        //System.out.println("smallest:"+ans[0]);
        //System.out.println("largest"+ans[1]);
        int[] result = smallestAndLargestElement(arr);
        System.out.println(" small and largest element is :"+ result[0]+ " " + result[1] );



    }
}
