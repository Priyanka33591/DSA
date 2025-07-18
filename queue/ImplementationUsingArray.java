package queue;

public class ImplementationUsingArray {

    public static void main(String[] args) {
        Queue q = new Queue(5);
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println("Peek Element: " + q.peek());
            System.out.println(q.remove());
        }

    }

    static class Queue {
        static int[] arr;
        static int size;
        static int rear;

        Queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        public boolean isEmpty() {
            return rear == -1;
        }

        //add -O(1)
        public void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }

            rear = rear + 1;
            arr[rear] = data;
        }

        //remove - O(n)
        public int remove() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;

            return front;
        }

        //peek - O(1)
        public int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }

            return arr[0];
        }
    }

}
