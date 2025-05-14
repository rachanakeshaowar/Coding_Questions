import java.util.Stack;
public class ReverseAStackWithoutExtraSpace {
    public static void main(String[] args) {
        Stack<Integer> sc = new Stack<>();
        for(int i=1;i<5;i++){
            sc.push(i);
        }
        System.out.println(sc);
        Reverse(sc);
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
    public static void Reverse(  Stack<Integer> sc  ) {
        if (sc.isEmpty()) {
            return;
        }
        int temp=sc.pop();
        Reverse(sc);
        Insert(sc,temp);
    }
}


















