package arraylist;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args){
        ArrayList arrayList =new ArrayList();
        arrayList.add("A");
        arrayList.add(10);
        arrayList.add("A");
        arrayList.add(null);
        System.out.println(arrayList);
        arrayList.remove(2);
        System.out.println(arrayList);
        arrayList.add(2,"m");
        arrayList.add("n");
        System.out.println(arrayList);

    }
}
