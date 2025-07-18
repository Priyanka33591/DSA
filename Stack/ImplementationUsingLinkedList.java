package Stack;

public class ImplementationUsingLinkedList {

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
        }
        System.out.println(s.isEmpty());
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }

    }

    static class Stack {
        public static Node head;

        // empty
        public boolean isEmpty() {
            return head == null;
        }

        //push
        public void push(int data) {
            Node newNode = new Node(data);
            if (isEmpty()) {
                head = newNode;
                return;
            }
            newNode.next = head;
            head = newNode;
        }

        //pop
        public int pop() {
            if (isEmpty()) {
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        //peek
        public int peek() {
            if (isEmpty()) {
                return -1;
            }
            return head.data;
        }
    }
}
