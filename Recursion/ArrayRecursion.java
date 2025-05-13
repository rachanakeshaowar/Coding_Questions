public class ArrayRecursion {
    // and find max out of array
    static void printArray(int[] arr,int idx){
        // base case
       if(idx==arr.length){
           return ;
       }
       //self work
        System.out.println(arr[idx]);
       // recursive work -subproblem
        printArray(arr,idx+1);// 6 7 8
    }
    static int maxInArray(int[] arr,int idx){
        //base case
        if(idx==arr.length-1){
            return arr[idx];
        }
        //small problem --> idx+1, end of array--> max --> recursive
        int smallAns =maxInArray(arr,idx+1);
        //self work and final ans
       return  Math.max(arr[idx],smallAns);
    }
    public static void main(String[] args) {
        int [] arr={5,6,7,8,9};
     //   printArray(arr,0);
        System.out.println(maxInArray(arr,0));
    }
}
//time complexity  of 2nd mehod is n amd spce complexity is also n
// tc = no.of calls*time in each call