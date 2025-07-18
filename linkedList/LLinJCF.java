package linkedList;
import java.util.LinkedList;
public class LLinJCF {
    public static void main(String[] args) {
        LinkedList <Integer> ll = new LinkedList<>();

//        add

        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

//       print
        System.out.println(ll);

//        remove

        ll.removeFirst();
        System.out.println(ll);
        ll.removeLast();
        System.out.println(ll);
    }
}
