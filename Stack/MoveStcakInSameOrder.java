import java.util.Stack;

public class MoveStcakInSameOrder {

    public static void main(String[] args) {
       
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        Stack<Integer> gt =new Stack<>();
        while(st.size()>0){
//            int x =st.peek();
//            rt.push(x);
//            st.pop();
            gt.push(st.pop());
        }
        Stack<Integer> rt =new Stack<>();
        while(gt.size()>0){
            rt.push(gt.pop());
        }
        System.out.println(rt);
        // here same time complexity and space complexity
//        int n;
//        System.out.println("Enter the elements you want to insert:");
//        n = sc.nextInt();
//        System.out.println("enter the elements ");
//        for(int i=0;i<=n;i++){
//            int x =sc.nextInt();
//            st.push(x);
//
////        }
//        System.out.println(st);
    }
}
