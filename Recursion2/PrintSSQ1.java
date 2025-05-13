public class PrintSSQ1 {
    public static void main(String[] args) {
        int[] arr ={1,2,3};
        printSubSeq(arr,0,"");
        System.out.println("no. of subsequences ces are:" + count);
    }
    public static int count=0;
    public static void printSubSeq(int[] arr, int startIndex ,String ans ){
        if(startIndex==arr.length){
            // Print the curr ans
            System.out.println(ans);
            count ++ ;
            return ;
        }
        printSubSeq(arr,startIndex +1,ans); //not take
        printSubSeq(arr,startIndex+1,ans + arr[startIndex]); //take
    }
}
