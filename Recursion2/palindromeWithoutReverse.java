import java.util.Scanner;

public class palindromeWithoutReverse {

    static boolean PalindromeCheck(String s ,int l,int r){
        if(l>=r) return true;
        return((s.charAt(l)==s.charAt(r) && PalindromeCheck(s,l+1,r-1)));
    }
    // f(s,r,l)---> is string s b/w indices l and r palindrome
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String s=sc.nextLine();
        System.out.println(PalindromeCheck(s,0,0));

    }
}
