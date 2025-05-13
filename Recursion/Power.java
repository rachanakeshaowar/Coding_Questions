public class Power {

        // find power of p to q

        static int pow(int p ,int q){
            if(p==0){
                return 0;// base case
            }
            if(p==1||q==0){
                return 1;
            }
            int smallPow = pow(p,q/2);
            if(q%2==0)
            return smallPow*smallPow ;
            else return smallPow * smallPow*p; // as for odd nos powers i.e for odd q ans will get wrong
            // recursive and self ork

        }
        public static void main(String[] args) {
            System.out.println(pow(2,3));
        }
    }
// here time complexity is less than previous solution
// total no. of calls is k+1 ===k or log q  * c (constant time operatins ) = log q*c =log q ; and
// while dry run keep one thing in mind that whenever function is called in betwn program we ahve start from startiong of function
// if we not  pre calculate smallPow before only then and wrote smallPow directly then our no. of recursive calls will increase and will be q
// but we precalculate then our time complexity is log q

