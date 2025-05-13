public class SearchIndices {
    // find all index of target
   static void findAllIndices(int[] a,int n,int target,int idx){
       //base case
       if(idx>=n){
           return ;
       }
       //self work
       if(a[idx]==target){
           System.out.println(idx);
       }
       //recursive work
       findAllIndices(a,n,target,idx+1);
   }



// return index of target if target present in array,otherwise return -1

    static int  findIndex(int[] a,int target ,int n,int idx){
//base case
        if(idx>=n){
            return -1;
        }
//self work
        if(a[idx]==target) return idx;
        return findIndex(a,n,target,idx+1);

    }
static boolean search(int[] a,int target ,int n,int idx){
//base case
if(idx>=n){
    return false;
}
//self work
    if(a[idx]==target) return true;
    return search(a,n,target,idx+1);

}

    public static void main(String[] args) {
        int[] a={1,2,3,4,4};
        int target =4;
        findAllIndices(a,a.length,target,0);
//        if(search(a,target,a.length,0)){
//            System.out.println("Yes");}
//            else{
//                System.out.println("No");
//            }

//        System.out.println(findIndex(a,a.length,target,0));
    }
}
//search method is representing if target present int he array arr starting from index (idx+1)