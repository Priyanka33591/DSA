package linkedList;

public class ReverseLinkedList {

    public static Node head;

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void add(int data){

        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    public void printList(){
        if(head == null){
            System.out.println("list is empty");
            return;
        }
        Node currentNode = head;
        while(currentNode != null){
            System.out.print(currentNode.data + "->");
            currentNode = currentNode.next;
        }
        System.out.println("null");
    }

    public void reverseList(){

        Node prev = null;
        Node currentNode = head;
        Node next;


        while(currentNode != null){
            next = currentNode.next;
            currentNode.next = prev;

            prev = currentNode;
            currentNode = next;
        }
        head = prev;
    }
    public static void main(String[] args) {
        ReverseLinkedList rl = new ReverseLinkedList();
        rl.add(1);
        rl.add(2);
        rl.add(3);
        rl.add(4);
        rl.add(5);
        rl.printList();
        rl.reverseList();
        rl.printList();

    }
}
