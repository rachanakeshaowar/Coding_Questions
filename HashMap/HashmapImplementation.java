import java.util.*;

public class HashmapImplementation {

    static class MyHashMap<K, V> {
        public static final int DEFAULT_CAPACITY = 4;
        public static final float DEFAULT_LOAD_FACTOR = 0.75f;

        private class Node {
            K key;
            V value;

            Node(K key, V value) {
                this.key = key;
                this.value = value;
            }
        }

        private int n; // number of entries
        private LinkedList<Node>[] buckets;

        private void initBuckets(int N) {
            buckets = new LinkedList[N];
            for (int i = 0; i < N; i++) {
                buckets[i] = new LinkedList<>();
            }
        }

        private int HashFunc(K key) {
            int hc = key.hashCode();
            return Math.abs(hc) % buckets.length;
        }

        private int searchInBucket(LinkedList<Node> ll, K key) {
            for (int i = 0; i < ll.size(); i++) {
                if (ll.get(i).key.equals(key)) { // Use equals() instead of ==
                    return i;
                }
            }
            return -1;
        }

        private void rehash() {
            LinkedList<Node>[] oldBuckets = buckets;
            initBuckets(oldBuckets.length * 2);
            n = 0;
            for (var bucket : oldBuckets) {
                for (var node : bucket) {
                    put(node.key, node.value);
                }
            }
        }

        public MyHashMap() {
            initBuckets(DEFAULT_CAPACITY);
        }

        public int size() {
            return n;
        }

        public void put(K key, V value) {
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei == -1) {
                Node node = new Node(key, value);
                currBucket.add(node);
                n++;
            } else {
                Node currNode = currBucket.get(ei);
                currNode.value = value;
            }

            if (n >= buckets.length * DEFAULT_LOAD_FACTOR) {
                rehash();
            }
        }

        public V get(K key) {
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei == -1) {
                return null;
            } else {
                return currBucket.get(ei).value;
            }
        }

        public V remove(K key) {
            int bi = HashFunc(key);
            LinkedList<Node> currBucket = buckets[bi];
            int ei = searchInBucket(currBucket, key);
            if (ei == -1) {
                return null;
            } else {
                Node removedNode = currBucket.remove(ei);
                n--;
                return removedNode.value;
            }
        }
    }

    public static void main(String[] args) {
        MyHashMap<String, Integer> mp = new MyHashMap<>();

        System.out.println("Testing put:");
        mp.put("a", 1);
        mp.put("b", 2);
        System.out.println("Size after 2 inserts: " + mp.size());

        mp.put("c", 30);
        System.out.println("Size after 3 inserts: " + mp.size());

        // Testing get
        System.out.println("Get a: " + mp.get("a")); // 1
        System.out.println("Get b: " + mp.get("b")); // 2
        System.out.println("Get c: " + mp.get("c")); // 30
        System.out.println("Get college: " + mp.get("college")); // null

        // Testing remove
        System.out.println("Remove c: " + mp.remove("c")); // 30
        System.out.println("Remove c again: " + mp.remove("c")); // null
        System.out.println("Size after remove: " + mp.size()); // 2
    }
}







