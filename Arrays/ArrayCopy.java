import java.util.Arrays;
import java.util.Scanner ;
public class ArrayCopy {

    static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] + " ");
        }
        System.out.println();
    }
        public static void main(String[] args){

            Scanner sc = new Scanner(System.in);
            System.out.println("enter the size of array : ");
            int n = sc.nextInt();
            int[] arr = new int[n];
            for(int i=0;i<arr.length ;i++) {
                arr[i] = sc.nextInt();
            }
            System.out.println("original array:");
            printArray(arr);
            //trying to copy arr to arr_2

           // 2) int [] arr_2 = arr.clone(); //--- > here deep copy happened

            // means here for arr_2 new space of  elements created in heap
            // so now address of arr_1 and arr_2 got changed 


            // 1) int [] arr_2 =arr; ----> will lead to change in original array also

            // when we write such statement we copy reference not actual  array
            // no new memory is al located
            // if new memory is allocated then new keyword may be used

          // 3) int[] arr_2 = Arrays.copyOf(arr,arr.length);


           // 4)
            int[] arr_2 = Arrays.copyOfRange(arr,0,arr.length);
            // here start index i.e 0 is included but last index i.e arr.length is excluded
            // if arr length is 4 then kit will print till index 3 rd index
// we can use this method to print array range from index we want to index we want to print or copy


            // class Arrays is already defined in library in java.util.Arrays
            //copyOf method in library take parameters as which array to copy and  how much length copy we want
            System.out.println("Copied array:");
            printArray(arr_2);

            // changing some values of array_2
            arr_2[0]= 0;
            arr_2[1]=0;
            System.out.println("original array after changing  some values of array 2 :");
            printArray(arr);
            System.out.println("Copied array after chnging some value sof array 2:");
            printArray(arr_2);
// if we make changes in new copy then old copy also get changed [ called shallow copy]
            // so to avoid this we can use a method called clone()
 //arr.clone to copy array as it is
            // by using this method original array will not get changed

            }
    }
