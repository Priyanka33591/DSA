package arrayList;

import java.util.ArrayList;
import java.util.Collections;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        
//      add operation - 0(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

//        another add operation - 0(n)
        list.add(5, 6);

//        print list
        System.out.println(list);

//        get element - 0(1)
        System.out.println(list.get(2));

//        remove element - 0(n)
        list.remove(5);
        System.out.println(list);

//        set element - 0(n)
        list.set(4, 6);
        System.out.println(list);

//        contains element -0(n)
        System.out.println(list.contains(3));
        System.out.println(list.contains(10));

//        size of list
        System.out.println(list.size());

// swap two numbers
        swap(list, 1, 3);
        System.out.println("after swapping" + list);

//sort the list
        Collections.sort(list);
        System.out.println(list);
    }

    public static void swap(ArrayList<Integer> list, int idx1, int idx2) {
//        swap two numbers [1, 2, 3, 4, 6]
//        after swapping [1, 4, 3, 2, 6]

        int temp = list.get(idx1);
        list.set(idx1, list.get(idx2));
        list.set(idx2, temp);
    }


}
