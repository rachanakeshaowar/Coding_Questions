import java.util.Stack;
public class InsertionInStackInJava {
    public static void displayreverserecursively(Stack<Integer> s){
       if(s.size()==0) return;// pass by reference
        int top =s.pop();
        System.out.print(top+" ");
        displayreverserecursively(s);
        s.push(top);



    }
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(4);
        st.push(5);
        st.push(6);


        displayreverserecursively(st);
//
//        int idx=2;
//        int x=7;
//        Stack<Integer> temp=new  Stack<>();
//        while(st.size()>idx){
//            temp.push(st.pop());
//        }
//        st.push(x);
//        while(temp.size()>0){
//            st.push(temp.pop());
//        }
//        System.out.println(st);
//int n =st.size();
//int[] arr= new int[n];
//for(int i=n-1;i>=0;i++){
//    arr[i]=st.pop();
//}
//for(int i=0;i<n;i++){
//    System.out.println(arr[i]+" ");
//    st.push(arr[i]);
//}


    }
}
// here complexity is 0(n) as call stack also takes memory
/// push at bottom by recursion
// reverse recursive
// remove from bottom /any index
