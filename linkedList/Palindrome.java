package linkedList;

public class Palindrome {

    public static Node head;

    public static void main(String[] args) {
        Palindrome pl = new Palindrome();
        pl.addFirst(5);
        pl.addFirst(4);
        pl.addFirst(3);
        pl.addFirst(4);
        pl.addFirst(4);
        pl.printLinkedList();
        System.out.println(pl.palindrome());
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void printLinkedList() {
        if (head == null) {
            System.out.println("null");
            return;
        }
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public boolean palindrome() {
        if (head == null || head.next == null) {
            return true;
        }

        //1. find mid
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        //2. reverse 2nd half

        Node prev = null;
        Node curr = slow;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev;
        Node left = head;

        // check if 1st half == 2nd half
        while (right != null) {
            if (right.data != left.data) {
                return false;
            }
            right = right.next;
            left = left.next;
        }

        return true;

    }

    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
