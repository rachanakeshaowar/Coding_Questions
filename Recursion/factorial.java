// Recurrence relation : relation between big problem and small problem is called recurrence relation
public class factorial {
    static int factorial(int n){
        if(n==0) return 1;
        int smallAns=factorial(n-1);
        int ans =n* smallAns ;
        return ans;
        // return n*factorial(n-1);
        }

    public static void main(String[] args) {
        System.out.println(factorial(4));
    }
}
// time complexity is n
//and space complexity n
// because here n stack frames are created at n calls
