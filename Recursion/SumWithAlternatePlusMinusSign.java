public class SumWithAlternatePlusMinusSign {


// give a number n find sum ofa all natural nos till n with alternate signs
        static int  f(int num ){
            if(num==1|| num==0){
                return num;// base case
            }
//            int presum =f(num-1);
//            int currsum;
//            if(num%2==0)  currsum=presum - num;
//            else currsum=presum + num;
//
//
//            return currsum;
            if(num%2==0)  return  f(num-1)-num;
            else return f(num-1)+num;

        }
        public static void main(String[] args) {

            System.out.println(f(5));

        }
    }
// f(n-1) +n is recurrence relation to print sum of n nos in this only one change
// if n is odd then add n and if n is even then substrat n
// here time complexity is n

