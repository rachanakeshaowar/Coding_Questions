public class SumOfDigitMethod2 {
    // find sum of digits

        static int nod(int n){
            if(n==0){
                return 0;// base case
            }
            if(n<0){
                n=-n;
            }
            return  1+ nod(n/10) ; // recursive and self ork
        }
        public static void main(String[] args) {
            System.out.println(nod(1));
        }
    }
// time complexity =no. of recursive calla * time taken in call is d
// space complexity is d same as no. of stacks frame required

