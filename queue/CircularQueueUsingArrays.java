package queue;

public class CircularQueueUsingArrays {

    public static void main(String[] args) {
        circularQueue q = new circularQueue(3);
        System.out.println(q.isEmpty());
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println("remove ele " + q.remove());
        q.add(4);
        System.out.println("remove ele " + q.remove());
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println("Peek Element: " +  q.peek());
            System.out.println(q.remove());
        }
    }

    static class circularQueue {

        public static int size;
        public static int front;
        public static int rear;
        int[] arr;

        public circularQueue(int n) {
            arr = new int[n];
            size = n;
            front = -1;
            rear = -1;

        }

        public boolean isEmpty() {
            return rear == -1 && front == -1;
        }

        public boolean isFull() {
            return (rear + 1) % size == front;
        }

        //add O(1)
        public void add(int data) {
            if (isFull()) {
                System.out.println("Queue is full");
                return;
            }

            //first element add
            if (front == -1) {
                front = 0;
            }
            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        //remove O(1)
        public int remove() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }

            int result = arr[front];
            //for last element deletion
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return result;
        }

        //peek O(1)
        public int peek() {
            if (isEmpty()) {
                System.out.println("queue is empty");
                return -1;
            }

            return arr[front];
        }


    }

}
