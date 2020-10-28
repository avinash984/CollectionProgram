package setinterface;

import java.util.HashSet;

// insertion order not preserved and duplicates are not allowed in HashSet and null insertion is possible
public class HashSetDemo {
    public static void main(String[] args){
        HashSet hashSet = new HashSet();
        hashSet.add("A");
        hashSet.add("B");
        hashSet.add("C");
        hashSet.add("D");
        hashSet.add(null);
        hashSet.add(10);
        System.out.println(hashSet.add("B"));   // false -- duplicates are not allowed
        System.out.println(hashSet);       //o/p-- [null, A, B, C, D, 10]   order not preserved

        // used for cache applications where insertion order must be preserved and duplicate are not allowed
    }
}
