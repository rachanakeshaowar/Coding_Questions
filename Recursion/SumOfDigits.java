// find sum of digits
public class SumOfDigits {
    static int sod(int n){
        if(n>=0 && n<=9){
           return n;// base case
        }
return  sod(n % 10)+sod(n/10); // recursive and self ork
    }
    public static void main(String[] args) {
        System.out.println(sod(12345));
    }
}
// time complexity =no. of recursive calla * time taken in call is d
// space complexity is d same as no. of stacks frame required