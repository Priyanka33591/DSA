package linkedList;

public class DoublyLinkedList{

    public static class Node{
        int data;
        Node next;
        Node prev;

        public Node(int data){
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    public void addFirst(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    public void print(){
        if(head == null){
            System.out.println("list is empty");
        }

        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "<->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    public void removeFirst(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        if(size == 1){
            head = tail = null;
            size--;
            return;
        }

        head = head.next;
        head.prev = null;
        size--;
    }

    public void addLast(int data){
        Node newNode = new Node(data);
        size++;
        if(head == null){
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        newNode.prev = tail;
        tail = newNode;
    }

    public void removeLast(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }

        if(size == 1){
            head = tail = null;
            size--;
            return;
        }

        Node temp = tail.prev;
        temp.next = null;
        tail.prev = null;
        tail = temp;
    }
    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.addFirst(3);
        dll.addFirst(2);
        dll.addFirst(1);
        dll.print();
        dll.removeFirst();
        dll.print();
        dll.addLast(4);
        dll.print();
        dll.removeLast();
        dll.print();

    }
}
