
import java.util.*;

public class HashSetBasics {
    public static void main(String[] args) {
        HashSet<String> st=new HashSet<>();
        st.add("James");
        st.add("scott");
        st.add("James");
        System.out.println(st);
        System.out.println(st.contains("James"));
        System.out.println(st.size());
        System.out.println(st);
        st.remove("James");
        System.out.println(st.contains("James"));
        System.out.println(st.size());
        st.add("sott");
        for(String s: st){
            System.out.print(s+" ");
        }
        System.out.println(st);

    }
}


