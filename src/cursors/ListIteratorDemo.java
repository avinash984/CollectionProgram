package cursors;

import java.util.LinkedList;
import java.util.ListIterator;

public class ListIteratorDemo {
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.add("ajay");
        linkedList.add("satish");
        linkedList.add("radheshyam");
        linkedList.add("abhishek");
        linkedList.add("pavnish");
        System.out.println(linkedList);
        ListIterator listIterator = linkedList.listIterator();
        while (listIterator.hasNext()){
            String s= (String) listIterator.next();
//            if (s.equalsIgnoreCase("satish")){
//                listIterator.remove();
//            }
//            if (s.equalsIgnoreCase("satish")){
//                listIterator.set("santosh");
//            }
            if (s.equalsIgnoreCase("abhishek")){
                listIterator.add("arun");
            }
        }
        System.out.println(linkedList);
    }
}
