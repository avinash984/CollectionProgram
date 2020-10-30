package mapinterface;

import java.util.Comparator;
import java.util.TreeMap;

public class TreeMapDemo2 {
    public static void main(String[] args){
        TreeMap treeMap = new TreeMap(new MyComparator());
        treeMap.put("XXX",10);
        treeMap.put("AAA",20);
        treeMap.put("ZZZ",30);
        treeMap.put("LLL",40);
        System.out.println(treeMap);       //{ZZZ=30, XXX=10, LLL=40, AAA=20}
    }
}
class MyComparator implements Comparator{

    @Override
    public int compare(Object o1, Object o2) {
        String s1 = o1.toString();
        String s2 = o2.toString();
        return s2.compareTo(s1);
    }
}
