package mapinterface;

import java.util.TreeMap;

public class TreeMapDemo {
    public static void main(String[] args){
        TreeMap treeMap = new TreeMap();
        treeMap.put(100,"ZZZ");
        treeMap.put(103,"YYY");
        treeMap.put(101,"XXX");
        treeMap.put(104,106);
        treeMap.put(107,null);
       // treeMap.put("FFF","XXX");       // ClassCastException
     //   treeMap.put(null,"xxx");       // null pointer exception
        System.out.println(treeMap);        // {100=ZZZ, 101=XXX, 103=YYY, 104=106, 107=null}

    }
}
