import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        // wrapper class object
        //creation

        Integer i = Integer.valueOf(4);
        System.out.println(i);
        Float f=Float.valueOf(4.5f);
        System.out.println(f);
        ArrayList<Integer> l1 =new ArrayList<>();
        l1.add(5);
        l1.add(6);
        l1.add(7);
        l1.add(8); // add method is used to add at last of arraylist
        // get an element at index i
        System.out.println(l1.get(1)); //6 to access element
        // print with for loop
        // here we will use size which is method but whwn we were printing array length was property

//for(int j=0 ;j<l1.size();j++){
//    System.out.println(l1.get(j)); // 5,6,7,8
//}
        System.out.println(l1); // 5,6,7,8 without using loop

       // adding some element at any index i [ 5 100 6 7 8 ]
        l1.add(1,100);
        System.out.println(l1);
// modifying element at index i
        l1.set(1,10);
        System.out.println(l1);// [5,10,6,7,8]
        // removing an element at index i
        l1.remove(1);
        System.out.println(l1); // 5 6 7 8

// removing an element in e  if index is not known

        System.out.println(  l1.remove(Integer.valueOf(7)));
        l1.remove(Integer.valueOf(7));//here we are passing object of wrapper class so use Integer.valueOf()
        System.out.println(l1);//[5 6 8]

        //check if an element exists
        boolean ans=l1.contains(Integer.valueOf(6));
        System.out.println(ans);

        // if you don't specify class,you can put anything inside l
        ArrayList l =new ArrayList();
        l.add("pqrs");
        l.add(1);
        l.add(true);
        System.out.println(l);

    }
}
//wrapper class is class whose object wraps primitive data type [int float boolean
// object of a wrapper class contains a field which stores PDT
// for ex int is wrapped in wrapper class Integer
// String is not a primitive datatype it is already a class
// how to create object of wrapper class

