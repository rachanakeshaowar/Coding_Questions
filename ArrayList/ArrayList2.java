import java.util.ArrayList;

import java.util.Collections;


public class ArrayList2 {
    static void reverseList(ArrayList<Integer> list){
int i=0,j=list.size() -1;
while(i<j){
    /*
    int temp =a;
    a=b;
    b=temp;
     */
    Integer temp =Integer.valueOf(list.get(i));
    list.set(i,list.get(j));
    list.set(j,temp);
    i++;
    j--;

}
    }

    public static void main(String[] args) {
        ArrayList<Integer>  list=new ArrayList<>();
        list.add( 0);
        list.add(10 );
        list.add( 3);
        list.add( 5);
        list.add(22 );
        list.add(10 );
        System.out.println("Original list "+ list);
        Collections.reverse(list);
        System.out.println("reversed list"+ list);
        reverseList(list);
        System.out.println("reversed list"+ list);
        Collections.sort(list);
        System.out.println(" ascending order sorted list is :"+ list);
// by use  of comparator we can sort arraylist in decending order
        Collections.sort(list, Collections.reverseOrder());
        System.out.println(" decending order sorted list is :"+ list);
 ArrayList<String>  l1 = new ArrayList<>();
 l1.add("welcome");
 l1.add("r");
 l1.add("to");
 l1.add("pw");
        System.out.println("og "+ l1);
        Collections.sort(l1);
        System.out.println(" ascending sorted : "+l1);
        // here lexicographycally sorting took place
        Collections.sort(l1,Collections.reverseOrder());
        System.out.println("sorted decending :"+l1);
    }
}
