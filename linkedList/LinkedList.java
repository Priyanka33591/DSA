package linkedList;

public class LinkedList {

    public static Node head;
    public static Node tail;
    public int size;

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(2);
        ll.addFirst(1);
        ll.addLast(4);
        ll.addLast2(5);
        ll.addMiddle(2, 3);
        ll.printLinkedList();
        System.out.println(ll.size);
        ll.addFirst(10);
        ll.addLast2(10);
        ll.printLinkedList();
        System.out.println(ll.size);
        ll.removeFirst();
        ll.printLinkedList();
        System.out.println(ll.size);
        ll.removeLast();
        ll.printLinkedList();
        System.out.println(ll.size);
        System.out.println("idx "+(ll.search(4)));
        System.out.println("idx " + (ll.recSearch(head,4)));
    }

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // if we have tail
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;

    }

    // if we don't have tail
    public void addLast2(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = newNode;
            return;
        }
        Node currentNode = head;

        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }

        tail = currentNode.next = newNode;

    }

    public void printLinkedList() {
        if (head == null) {
            System.out.println("list is empty");
            return;
        }
        Node currentNode = head;

        while (currentNode != null) {
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }

        System.out.println("null");
    }

    public void addMiddle(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }
        Node newNode = new Node(data);
        size++;
        Node currentNode = head;
        int i = 0;

        while (i != idx - 1) {
            currentNode = currentNode.next;
            i++;
        }
        newNode.next = currentNode.next;
        currentNode.next = newNode;

    }

    public void removeFirst(){

        if(head == null){
            System.out.println("linked list is empty");
            return;
        }else if(size == 1){
            head = tail = null;
            size--;
            return;
        }
        head = head.next;
        size--;
    }

    public void removeLast(){

        if(head == null){
            System.out.println("linked list is empty");
            return;
        }else if(size == 1){
            head = tail = null;
            size--;
            return;
        }

        Node currentNode = head;
        while(currentNode.next.next != null){
            currentNode = currentNode.next;
        }
        currentNode.next = null;
        tail = currentNode;
        size--;
    }

    public int search(int key){
        Node currentNode = head;
        int i = 0;
        while(currentNode != null){
            if(currentNode.data == key){
                return i;
            }
            currentNode = currentNode.next;
            i++;
        }

        return -1;
    }

    public int recSearch(Node head , int key){
        if(head == null){
            return -1;
        }

        if(head.data == key){
            return 0;
        }

        int idx = recSearch(head.next , key);

        return idx+1;
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

