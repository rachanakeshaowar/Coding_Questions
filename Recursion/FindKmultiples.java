public class FindKmultiples
{
  //given a number num and a value k . print k multiples of num
        static int  f(int num ,int k){
            if(k==1){
                return num;// base case
            }
// recursive work

      int ans=   f(num,k-1);
            System.out.println(num*k);//self work
// in recursion it is imp to know that which work to do first recursive work or self work
            // recursive and self work
            return ans;
        }
        public static void main(String[] args) {

            System.out.println(f(2,5));

        }
    }
// In this question big pronlem then small problem i.e recursive work then self work then base case
// self wprk and small problem is recurrence relation
//here time complexity is k and space complexity is also k

