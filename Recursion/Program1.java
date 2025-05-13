// what is recursion
// a function calling itself with different parameters and a base case to terminate the infinite loop
// in recursion, we  solve a bigger problem by solving smaller subproblems
// functions --> problems PI(n)
//                subproblem PI(n-1)
// a function calls itself to solve its subproblem 



// method to solve recursion quesions
// 1) identify smaller problem --> let recursion solution
//2) self work ---> do your work
//3) identify the base case ---> smallest problem for which ans is obvious
// Note check if we have run recursive work first or self work first according to question


import java.util.Scanner;

// base case ,assume,self work
// print numbers from 1 to n
// base case or haulting condition is verry imp in recursion in this program which  we wrote at n=1
// by writing base case we came out from infinite recursion and we get rid of stack overflow error
public class Program1 {
    static void printIncresing(int n) { //1 ,2,3...n-1,n
        if (n == 1) {
            // haulting condition which is smallest value whose ans we know
            System.out.println(n);
            return;// to stop execution of method
        }
        printIncresing(n - 1);// 1,2 ,.... n-1 // solving smaller subproblem
        System.out.println(n);//self work as before we will print till n-1 only
    }

    static void printDecresing(int n){
        if(n==1){// base case
            System.out.println(n);
            return ;
        }
        System.out.println(n);//self work
        printDecresing(n-1);// recursive work
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printDecresing(n);
    }
}

