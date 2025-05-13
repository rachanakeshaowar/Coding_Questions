import java.util.ArrayList;

public class Program13_findindexoftarget {
   static ArrayList<Integer> allIndices(int[] a,int n,int target,int idx){// Array -->1 4 3 4   target -4  ans(arraylist)-->[1,3]
// base case
       if(idx>=n){
          return new ArrayList<Integer>(); // return empty arraylist

       }
       ArrayList<Integer> ans =new ArrayList<>();
       //self work
       if(a[idx]==target){
           ans.add(idx);
       }
//recursive work
      ArrayList<Integer> smallAns = allIndices(a,n,target,idx+1);
ans.addAll(smallAns);//{0,1,3}
       return ans ;
   }
    public static void main(String[] args) {
       int [] a= {1,2,3,4,4,4,5};
       int target =4;
       int n =a.length;

ArrayList<Integer> ans =allIndices(a,n,target,0);
for(Integer i :ans){
    System.out.println(i);
}
    }
}
