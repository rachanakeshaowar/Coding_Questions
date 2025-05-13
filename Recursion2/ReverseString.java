import java.util.Scanner;

public class ReverseString {
    static String ReverseString(String s ,int idx){
        // base case
        if(idx==s.length()) return "";
        // subproblem
      String    smallAns =ReverseString(s,idx +1);
      //recurrsive work
       return smallAns + s.charAt(idx);
    }
    static String reverse(String s){
        if(s.length()==0) return "";
        String smallAns =reverse(s.substring(1));
        return smallAns + s.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s =sc.nextLine();

        System.out.println(ReverseString(s,0));
        System.out.println(reverse(s));
        String rev =ReverseString(s,0);
        if(rev.equals(s)){
            System.out.println("  yes palindrome");
        }
        else System.out.println("  no palidrome ");
    }
}
// complexity n^2
// to compare strings use equuals method