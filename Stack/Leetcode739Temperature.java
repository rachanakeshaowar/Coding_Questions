import java.util.Stack;

public class Leetcode739Temperature {
    //In stack ,push only if empty ,or st.top < current element.
    // If it was empty ,then ans is 0 .
    // if not empty then ans is difference of their index .
 //   if( not empty)
    //st.pop till st.top < current or !st.empty()
    //st.push
//    public static void main(String[] args) {
//        String s ="73,74,75,71,69,72,76,73";
//        char curr=s.charAt(s.length()-1);
//        Stack<Integer> sc = new Stack<>();
//   if(sc.isEmpty()||sc.peek()<curr) sc.push(Integer.parseInt(s));
//   if(sc.isEmpty()) System.out.println(0);
    public int[] dailyTempretures(int[] tempretures){
        Stack<Integer> st =new Stack<>();

    int[] ans =new int[tempretures.length];
    for(int i=tempretures.length-1;i>=0;i--){
        int current =tempretures[i];
        while(!st.isEmpty() && tempretures[st.peek()]<=current){
            st.pop();
        }
        if(st.isEmpty()){
            ans[i]=0;
        }
        else{
            ans[i]=st.peek()-i;
        }
        st.push(i);
    }


return ans;

    }

    public static void main(String[] args) {

    }

}
