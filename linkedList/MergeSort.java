package linkedList;

public class MergeSort {

    public static Node head;

    public static Node mergeList(Node left, Node right) {

        Node dummyNode = new Node(-1);
        Node temp = dummyNode;

        while (right != null && left != null) {
            if (left.data <= right.data) {
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }

        if (left != null) temp.next = left;
        if (right != null) temp.next = right;

        return dummyNode.next;


    }

    public static void main(String[] args) {
        MergeSort ms = new MergeSort();
        ms.add(5);
        ms.add(1);
        ms.add(4);
        ms.add(3);
        ms.add(2);
        ms.add(6);
        ms.printList();
        head = ms.mergeSort(head);
        ms.printList();
    }

    public void add(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void printList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }

        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public Node mergeSort(Node head) {

        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head;
        Node fast = head.next;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;

        }

        Node rightHead = slow.next;
        slow.next = null;
        Node leftHead = head;

        Node leftSorted = mergeSort(leftHead);
        Node rightSorted = mergeSort(rightHead);

        return mergeList(leftSorted, rightSorted);

    }

    public static class Node {
        Node next;
        int data;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }
}
