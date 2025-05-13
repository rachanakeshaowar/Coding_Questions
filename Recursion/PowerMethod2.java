public class PowerMethod2 {
    // find power of p to q

    static int pow(int p ,int q){
        if(p==0){
            return 0;// base case
        }
        if(p==1||q==0){
            return 1;
        }
        return  pow(p,q-1)*p ; // recursive and self ork
    }
    public static void main(String[] args) {
        System.out.println(pow(1,5));
    }
}
// time complexity =no. of recursive calls * time taken in call is
// here no.of recursive calls takes constant time so time complexity is q as no. of calls are q*c ---> q
// space complexity is q same as no. of stacks frame required i.e q

