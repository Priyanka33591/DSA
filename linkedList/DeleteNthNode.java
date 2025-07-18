package linkedList;

public class DeleteNthNode {

    public static class Node{
        int data;
        Node next;

        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;

    public void addFirst(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void printLinkedList(){
        if(head == null){
            System.out.println("null");
            return;
        }
        Node curr = head;
        while(curr != null){
            System.out.print(curr.data + "->");
            curr = curr.next;
        }
        System.out.println("null");
    }

    public void deleteNthNode(int n){
        int size = 0;
        Node temp = head;
        while(temp != null){
            temp = temp.next;
            size++;
        }

        if(size == n){
            head = head.next;
            return;
        }

        int idx = 1;
        Node prev = head;
        while(idx < (size - n)){
            prev = prev.next;
            idx++;
        }
        prev.next = prev.next.next;

    }
    public static void main(String[] args) {
        DeleteNthNode dl = new DeleteNthNode();
        dl.addFirst(5);
        dl.addFirst(4);
        dl.addFirst(3);
        dl.addFirst(2);
        dl.addFirst(1);
        dl.printLinkedList();
        dl.deleteNthNode(3);
        dl.printLinkedList();
    }
}
