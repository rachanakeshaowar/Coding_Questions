public class Fibonacci {
    static int fib(int n ){
        // base case
        if(n==0 || n==1){
            return n;
        }
        //subproblem : recursive work
//        int prev =fib(n-1);
//        int prevPrev = fib(n-2);
//// self work
//        return   prev +prevPrev ;
        return fib(n-1)+fib(n-2);
    }

    public static void main(String[] args) {
        System.out.println(fib(5));
    }
}
//space complexity is calculated by seeing stack frames used in program
// if in program we not see space complexity but in recursion stack frame is created while function calls so count that space here whic is n
//space complexity is n

// to find time complexity = no. of recursive calls * time tAaken in one call
// time complexity is also 2^ n // refer video for detail