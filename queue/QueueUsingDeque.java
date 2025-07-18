package queue;

import java.util.Deque;
import java.util.LinkedList;

public class QueueUsingDeque {

    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);

        System.out.println(queue.dequeue());  // 1
        System.out.println(queue.peek());     // 2
    }

    static class Queue {

        Deque<Integer> dq = new LinkedList<>();

        public void enqueue(int data) {
            dq.addLast(data);  // add to rear
        }

        public int dequeue() {
            if (dq.isEmpty()) {
                return -1;
            }
            return dq.removeFirst();  // remove from front
        }

        public int peek() {
            if (dq.isEmpty()) {
                return -1;
            }
            return dq.getFirst();  // peek front
        }

        public boolean isEmpty() {
            return dq.isEmpty();
        }
    }
}
