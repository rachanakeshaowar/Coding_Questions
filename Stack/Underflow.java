import java.util.Stack;

public class Underflow {
    public static void main(String[] args) {
        Stack<Integer> st=new Stack<>();
        st.push(1);
        st.push(2);
        st.push(4);
        st.push(5);
        st.push(6);
        System.out.print(st+" ");
        st.pop();
        System.out.print(st+" ");
        st.pop();
        System.out.print(st+" ");
        st.pop();
        System.out.print(st+" ");
        st.pop();
        System.out.print(st+" ");
        st.pop();
        System.out.print(st+" ");
        st.pop();// this will cause error that is underflow as stack is empty
        // if stack is full and we are pushing new element then stack overflow error occurs
        // if computer meomory is full
        // if we implement array with stack then if we assign size then we get stack overflow error

    }
}
