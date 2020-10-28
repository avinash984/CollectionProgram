package setinterface;

import java.util.LinkedHashSet;

/// insertion order is preserved and duplicates is not allowed
public class LinkedHashSetDemo {
    public static void main(String[] args){
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        linkedHashSet.add("A");
        linkedHashSet.add("B");
        linkedHashSet.add("C");
        linkedHashSet.add(null);
        linkedHashSet.add(10);
        System.out.println(linkedHashSet.add("C"));  // false
        System.out.println(linkedHashSet);  // [A, B, C, null, 10]       insertion order is preserved

        // used for cache applications where insertion order must be preserved and duplicate are not allowed
    }
}
