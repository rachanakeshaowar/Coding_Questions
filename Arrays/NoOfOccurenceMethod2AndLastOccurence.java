import java.util.Scanner ;
public class NoOfOccurenceMethod2AndLastOccurence {


    static int[] smallestAndLargestElement(int[] arr) {
        int[] arr_1 = new int[2];
int smallest = arr[0];
int largest =arr[0];

        for (int i = 1; i < arr.length; i++) {

                if (arr[i] < smallest) {
                  smallest = arr[i];


                }
                if (arr[i] > largest ) {
                  largest = arr[i];



                }

            }
        arr_1[0]=smallest;
        arr_1[1]=largest;

            return  arr_1 ;
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
        int[] smallestAndLargest = smallestAndLargestElement(arr);

        System.out.println("smallest and largest element is "+smallestAndLargest[0]+" " +smallestAndLargest[1]  );


    }
}
