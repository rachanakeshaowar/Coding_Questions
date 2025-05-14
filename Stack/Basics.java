import java.util.Stack;
public class Basics {
    public static void main(String[] args) {
        Stack<Integer> st =new Stack<>();
        System.out.println("size as :" +st.size());
        System.out.println(st);
        st.push(1);
        st.push(23);
        st.push(12);
        st.push(13);
        System.out.println(st.isEmpty());
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println("size is :"+st.size());
        while(st.size()>2){
            st.pop();
        }
        System.out.println(st.peek());
        System.out.println(st);
    }
}
