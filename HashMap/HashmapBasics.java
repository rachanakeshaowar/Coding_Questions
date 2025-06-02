import java.util.*;
public class HashmapBasics {
 static void HashMapMethods(){
     Map<String,Integer> mp=new HashMap<>();
     mp.put("Akash",21);
     mp.put("Yash",16);
     mp.put("shiv",21);
     mp.put("om",21);
     mp.put("kunal",21);
     mp.put("paresh",21);

     System.out.println(mp.get("Yash"));
     System.out.println(mp.get("Rahul"));
     mp.put("Akash",25);
     System.out.println(mp.get("Akash"));
     System.out.println(mp.remove("Akash"));// returns value if key exist or not exist ten null
     System.out.println(mp);
     System.out.println(mp.containsKey("Akash"));//false
     System.out.println(mp.containsKey("om"));//true
     mp.putIfAbsent("riya",34);//add
     mp.putIfAbsent("Yash",16);// not add
     System.out.println(mp);
     System.out.println(mp.keySet());
     System.out.println(mp.values());
     System.out.println(mp.entrySet());

     // traversing all entries of Hashmap -multiple methods
     for(String key : mp.keySet()){
         System.out.printf("Age of %s is %d\n",key,mp.get(key));
     }
     System.out.println(true);
     for(Map.Entry<String,Integer> e : mp.entrySet()){
         System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
     }

     System.out.println();
     for(var e : mp.entrySet()){
         System.out.printf("Age of %s is %d\n",e.getKey(),e.getValue());
     }






 }

    public static void main(String[] args) {
        HashMapMethods();
    }
}
// to access a value one must know its key
//Hashmap doesnt allow duplicate keys but allows duplicate values . That  means A single
// key cant contain more than 1 value but more tahn 1 key can contain a single value .
// Hashmap allows null key also but only once and multiple null values .
// Java hashmap maintains no order


// Appliactions of Hashmap
// Problem related to ferq of item
// mapping problems
//storage optimization
//dictionary
// phonebook


