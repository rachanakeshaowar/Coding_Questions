import java.util.HashMap;
import java.util.HashSet;

public class Isomorphic {
    public boolean isomorphic(String str,String str1) {

        HashMap<Character,Character> mp = new HashMap<>();

        for(int i=0;i<str.length();i++) {

                Character ch = str.charAt(i);
                Character ch1 = str1.charAt(i);
            if(mp.containsKey(ch)){
               if( mp.get(ch)!= ch1) return false;

               else if(mp.containsValue(ch1)){
                   return false;

               }else{
                   mp.put(ch,ch1);
               }
            }
// containsValue is linear operation so this complexity will go to n^2 so to reduce it we have to use constant


            }
        return true;

    }
    public boolean isomorphic2(String str,String str1) {

        HashMap<Character,Character> mp = new HashMap<>();
        HashSet<Character> st=new HashSet<>();

        for(int i=0;i<str.length();i++) {

            Character ch = str.charAt(i);
            Character ch1 = str1.charAt(i);
            if(mp.containsKey(ch)){
                if( mp.get(ch)!= ch1) return false;

                else if(st.add(ch1)){
                    return false;
                    // this is constant time operation so no  n^2 complexity

                }else{
                    mp.put(ch,ch1);
                    st.add(ch1);
                }
            }
// containsValue is linear operation so this complexity will go to n^2 so to reduce it we have to use constant


        }
        return true;

    }
    public static void main(String[] args) {
        Isomorphic iso = new Isomorphic();
        System.out.println(iso.isomorphic("egg", "add")); // true
        System.out.println(iso.isomorphic("foo", "bar")); // false
        System.out.println(iso.isomorphic2("paper", "title")); // true
        
    }

}



