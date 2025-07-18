package queue;

public class ImplementationUsingLinkedList {

    public static void main(String[] args) {

        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        System.out.println("remove ele " + q.remove());
        q.add(5);

        while (!q.isEmpty()) {
            System.out.println("Peek Element: " + q.peek());
            System.out.println(q.remove());
        }
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static class Queue {
        public static Node head = null;
        public static Node tail = null;

        //isEmpty
        public boolean isEmpty() {
            return head == null && tail == null;
        }

        //add O(1)
        public void add(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        //remove O(1)
        public int remove() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            int front = head.data;

            //single element in queue
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        //peek O(1)
        public int peek() {
            if (isEmpty()) {
                System.out.println("Queue is Empty");
                return -1;
            }
            return head.data;
        }

    }
}

