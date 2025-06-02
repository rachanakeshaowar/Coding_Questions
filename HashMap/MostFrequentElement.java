import java.util.*;
public class MostFrequentElement {
    public static void main(String[] args) {
        Map<Integer, Integer> freq = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (!freq.containsKey(arr[i])) {
                freq.put(arr[i], 1);
            } else {
                freq.put(arr[i], freq.get(arr[i]) + 1);

            }

        }
        System.out.println(freq.entrySet());
        int maxFreq = 0;
        int ansKey=-1;
//        for (var e : freq.entrySet()) {
//            System.out.printf("(%d,%d)", e.getKey(), e.getValue());
//            if (e.getValue() > maxFreq) {
//                maxFreq = e.getValue();
//                ansKey= e.getKey();
//            }
//
//        }
//        System.out.println();
//        System.out.printf("%d,%d",ansKey,maxFreq);
           for(var key: freq.keySet()){
               if(freq.get(key)>maxFreq){
                   maxFreq=freq.get(key);
                   ansKey=key;
               }
           }
        System.out.printf("%d has max freq  and it occurs %d times ",ansKey,maxFreq);
    }
}
// arbitary size key to hashed key conversion is called hashing  though which function we are performing hashing is called hash function
// Hasing theory
// A perfect hash function always produces unique for unique input
// non perfect hash function may perform collision and may get same output for diff inputs



