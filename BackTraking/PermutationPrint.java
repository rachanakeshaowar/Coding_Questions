import java.util.ArrayList;
import java.util.List;

public class PermutationPrint {
    public static void printp(String str , String t,List<String> l ){
        if(str.equals("")){
            //  in java use dont use str ===" "
//use equals  function
           l.add(t);
            return;
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);//b
            String left=str.substring(0,i);//a
            String right=str.substring(i+1);//c
            String rem=left + right;
            printp(rem,t+ch,l);
        }
    }
    public static void main(String[] args) {
        String str="abc";
        List<String> l =new ArrayList<>();
        printp(str,"",l);
        for(int i=0;i<l.size();i++){
            System.out.println(l.get(i));
        }
    }
}
