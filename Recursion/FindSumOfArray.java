public class FindSumOfArray {


        static int SumOfArray(int[] arr,int idx){
            //base case
//            if(idx==arr.length-1){
//                return arr[idx] ;
//            }
           // any base case can be used
            if(idx==arr.length){
                return 0;
            }
            //small problem --> idx+1, end of array--> max --> recursive
            int smallAns =SumOfArray(arr,idx+1);

            //self work and final ans
            return  smallAns+arr[idx];
        }
        public static void main(String[] args) {
            int [] arr={5,6,7,8,9};
            //   printArray(arr,0);
            System.out.println(SumOfArray(arr,0));
        }
    }
//imp very --> f(arr,idx) represents sum of array starting from index idx so our base case is
// that if idx==n-1 then only one element that is last element sum will there which is element itself
// means(arr,1)=6+7+8+9 sum from index 1 to last index
