package linkedlist;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args){
        LinkedList linkedList = new LinkedList();
        linkedList.add("bhaskar");
        linkedList.add(30);
        linkedList.add(null);
        linkedList.add("bhaskar");
        System.out.println(linkedList);
        linkedList.set(0,"software");
        System.out.println(linkedList);
        linkedList.set(0,"appindia");
        System.out.println(linkedList);
        linkedList.removeLast();
        linkedList.removeFirst();
        System.out.println(linkedList);
        linkedList.addFirst("appindia");
        System.out.println(linkedList);
    }
}
