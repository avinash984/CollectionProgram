package mapinterface;

import java.util.*;

public class HashMapDemo {
    public static void main(String[] args){
        HashMap hashMap = new HashMap();
        hashMap.put("ajay",700);
        hashMap.put("satish",800);
        hashMap.put("naveen",200);
        hashMap.put("santosh",500);
        System.out.println(hashMap);   //{satish=800, santosh=500, naveen=200, ajay=700}
        System.out.println(hashMap.put("avinash",100));   //null
        System.out.println(hashMap); // {satish=800, santosh=500, naveen=200, ajay=700, avinash=100}
        Set s = hashMap.keySet();
        System.out.println(s);   //[satish, santosh, naveen, ajay, avinash]
        Collection c= hashMap.values();
        System.out.println(c);   //[800, 500, 200, 700, 100]
        Set set = hashMap.entrySet();
        System.out.println(set);  //[satish=800, santosh=500, naveen=200, ajay=700, avinash=100]
        Iterator iterator = set.iterator();
        while (iterator.hasNext()){
            Map.Entry m1 = (Map.Entry) iterator.next();
            System.out.println(m1.getKey() + " " + m1.getValue() + " ");  //satish 800 santosh 500 naveen 200 ajay 700 avinash 100
            if (m1.getKey().equals("satish")){
                m1.setValue(2000);
            }
        }
        System.out.println(hashMap);  //{satish=2000, santosh=500, naveen=200, ajay=700, avinash=100}
    }
}

