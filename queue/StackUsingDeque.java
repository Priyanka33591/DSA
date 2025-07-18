package queue;

import java.util.Deque;
import java.util.LinkedList;
public class StackUsingDeque {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
//        System.out.println(stack);
        System.out.println(stack.pop());
//        System.out.println(stack);
        System.out.println(stack.peek());

    }

    static class Stack {

        Deque<Integer> dq = new LinkedList<>();

        public void push(int data) {
            dq.addFirst(data);
        }

        public int pop() {
            if(dq.isEmpty()){
                return -1;
            }
            return dq.removeFirst();
        }

        public int peek() {
            if(dq.isEmpty()){
                return -1;
            }
            return dq.getFirst();
        }
    }

}
