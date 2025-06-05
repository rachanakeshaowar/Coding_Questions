
import java.util.*;

public class MaxNosOnTable_HashSet {
    public int MaxonTables(int[] arr){
        HashSet<Integer> set=new HashSet<>();
        int max=0;
        for(int i=0;i<arr.length;i++){


            if(set.contains(arr[i])){
                set.remove(arr[i]);
            }
            else{
                set.add(arr[i]);
            }
       max=Math.max(max,set.size());


            }
        return max;
        }
    public static void main(String[] args) {
        MaxNosOnTable_HashSet obj = new MaxNosOnTable_HashSet();

        // Example: [1 enters, 2 enters, 1 leaves, 3 enters, 2 leaves, 3 leaves]
        int[] arr = {1, 2, 1, 3, 2, 3}; // Expected max = 2 (when 1 and 2 are in)
        System.out.println("Maximum number of people on table: " + obj.MaxonTables(arr));
    }
}

    













