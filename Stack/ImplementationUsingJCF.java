package Stack;

import java.util.Stack;

public class ImplementationUsingJCF {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println("is Stack Empty?" + s.isEmpty());
        while (!s.isEmpty()) {
            System.out.println("Peek: " + s.peek());
            System.out.println("Pop: " + s.pop());
        }

    }

}
