import java.util.Scanner;
// Remove occurences of a
public class StringRecursionProgram1 {
    //  CharAt() method then s.length() method then
    // substring method is used  print ranged string and cut other
    //s.substring(2,3) 2 is included and 3 is excluded index
    //s.substring(1) will give output without index 0   input: college then output: ollege

    static String removeA(String s, int idx) {
        // base case
        if (idx == s.length()) return " ";
        // recursive work
        String smallAns = removeA(s, idx + 1);
        //self work
        char currChar = s.charAt(idx);
        if (currChar != 'a') {
            return currChar + smallAns; // d+bcx
        } else {
            return smallAns;
        }

    }


    static String RemoveA2(String s) {
        if (s.length() == 0) return " ";
        String smallAns = RemoveA2(s.substring(1));


        char currChar = s.charAt(0);
        if (currChar != 'a') {
            return currChar + smallAns; // d+bcx
        } else {
            return smallAns;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        System.out.println(RemoveA2(s));

    }

}
// complexity of program is no. of calls into time taken in one call
// n * n =n^2 complexity because concatenation of string i.e + operator of concatination  takes linear time
// which is equal to length of string i.e n
// substring method is also linear time so and concatinated so 2nd method will also have n ^2 complexity

// bigger proble, f(String s, int idx) --- > will remove all a starting from index idx