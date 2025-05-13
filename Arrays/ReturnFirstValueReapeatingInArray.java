import java.util.Scanner ;
public class ReturnFirstValueReapeatingInArray {
    static int  firstReapeatingNumber(int[] arr ){
        int n = arr.length ;
        for(int i =0 ;i<arr.length ;i++){//first no.
            for(int j =i+1 ;j<arr.length ;j++){ // second no.
                if(arr[i] ==arr[j]){// found ans
                    return arr[i]; // after this return statement  all for loops will get closed and return will execute
                }
            }

        }
        return  -1;



    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();

        }
        System.out.println("first repeating  element :"+  firstReapeatingNumber(arr));
    }
}

