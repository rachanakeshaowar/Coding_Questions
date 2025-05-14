import java.util.Stack;
public class Leetcode_20_parenthesid {
    //opening and closing brakets of same type if stack is empty then string is valid
    // loop through every character
    // if opening push
    //if closing ,check top,and match,if not maching return false
    //if matching , pop stack
    //if stack is empty ,return true else false
    public static boolean isOpening(char ch){
     return     ch=='('  ||  ch =='{' || ch== '[' ;
    }
        public static boolean isMatching(char open, char close) {
            return (open == '(' && close == ')') ||
                    (open == '{' && close == '}') ||
                    (open == '[' && close == ']');
        }
        public static  boolean isValid(String s) {
            Stack<Character> st = new Stack<>();
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if (isOpening(ch)) {
                    st.push(ch);
                } else {
                    if (st.isEmpty()) {
                        return false;
                    }
                    char top = st.peek();
                    if (!isMatching(top, ch)) {
                        return false;
                    } else {
                        st.pop();
                    }
                }
            }
            return st.isEmpty();
        }
    public static void main(String[] args) {
        String l="{}[)]";
       boolean k= isValid(l);
        System.out.println(k);
    }
    }




