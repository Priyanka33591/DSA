package linkedList;

public class ZigZagLinkedList {

    public static Node head;

    public static void main(String[] args) {
        ZigZagLinkedList ll = new ZigZagLinkedList();
        ll.addFirst(5);
        ll.addFirst(4);
        ll.addFirst(3);
        ll.addFirst(2);
        ll.addFirst(1);
        ll.printLinkedList();
        ll.zigZagLinkedList();
        ll.printLinkedList();

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

    public void zigZagLinkedList() {

        if (head == null || head.next == null) {
            return;
        }

        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }


        Node prev = null;
        Node curr = slow.next;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node rightHead = prev;
        Node leftHead = head;
        slow.next = null;

        Node leftNext;
        Node rightNext;

        while (rightHead != null && leftHead != null) {
            leftNext = leftHead.next;
            leftHead.next = rightHead;
            rightNext = rightHead.next;
            rightHead.next = leftNext;


            rightHead = rightNext;
            leftHead = leftNext;
        }


    }

    public static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
