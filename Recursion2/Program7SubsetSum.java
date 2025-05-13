public class Program7SubsetSum {
    static void subsetSum(int[] a ,int n,int idx ,int sum){

        if(idx>= n){
            System.out.println(sum);
            return ;
        }
        // curr idx+curr ans (sum)
        subsetSum(a,n,idx +1 ,sum + a[idx]); //include


        subsetSum(a,n,idx +1,sum); //exclude
        // curr ans
    }

    public static void main(String[] args) {
int[] a= {1,2,3};
subsetSum(a,a.length,0,0);
    }
}
