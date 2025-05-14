public class problem1 {

// given an integer array arr , move all 0's to the end of it while maintaining relative order of non zero element
    // this must be in-place without making an new array
static void SendAllZeroesEnd(int [] a){
    int n=a.length ;
    // n-1 iterartions /passes
    for(int i=0;i<n-1;i++){
        boolean flag = false ;// has any swapping
        for(int j=0;j<n-i-1;j++){
            // last i elements are already at correct sorted positions so no need to check them
            if(a[j]==0 && a[j+1]!=0){
                //swap
                int temp =a[j];
                a[j]=a[j+1];
                a[j+1]=temp;
                flag=true; // some swaps happened
            }

        }
        if(flag==false) // have any swaps happened
            return;
    }
}

    public static void main(String[] args) {
        int[]a ={0,1,2,0,7,6,8};
        int n=a.length ;
        SendAllZeroesEnd(a);
        for(int i :a){ // for each loop
            System.out.println(i+" ");
        }
    }
}
    

