import java.util.*;
// insert in stack 5
public class inbuild_Stack {
    public static void main(String[] args) {
        Stack<Integer> sc = new Stack<>();
        for(int i=1;i<5;i++){
            sc.push(i);
        }
        System.out.println(sc);
      Insert(sc,5);
        System.out.println(sc);

    }

    public static void Insert(  Stack<Integer> sc,int val  ) {
        if (sc.isEmpty()) {
sc.push(val);
            return;
        }
      int temp=sc.pop();
        Insert(sc,val);
        sc.push(temp);





    }

}
