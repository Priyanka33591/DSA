package Stack;

import java.util.ArrayList;

public class ImplementationUsingArrayList {
    public static void main(String[] args) {
        Stack s = new Stack();
        System.out.println(s.isEmpty());
        s.push(3);
        s.push(2);
        s.push(1);
        System.out.println(s.isEmpty());
        while (!s.isEmpty()) {
            System.out.println("Peek: " + s.peek());
            System.out.println("Pop: " + s.pop());
            System.out.println(s.isEmpty());
        }

    }

    static class Stack {
        static ArrayList<Integer> stack = new ArrayList<>();

        public boolean isEmpty() {
            return stack.isEmpty();
        }

        //push
        public void push(int data) {
            stack.add(data);
        }

        //pop
        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = stack.getLast();
            stack.removeLast();
            return top;
        }

        //peek
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return stack.getLast();

        }
    }
}

