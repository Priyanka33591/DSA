package linkedList;

public class CycleInLinkedList {

    public static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public static Node head;

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        }

        newNode.next = head;
        head = newNode;
    }

    public static void printList(){
        if(head == null){
            System.out.println("null");
        }
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data +"->");
            temp = temp.next;
        }
        System.out.print("null");
    }

    public static boolean dedectCycle(){
        Node slow = head;
        Node fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                return true;
            }
        }
        return false;
    }

    public static void removeCycle(){
        Node slow = head;
        Node fast = head;
        boolean isCycle = false;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;

            if(fast == slow){
                isCycle = true;
                break;
            }
        }
        if(!isCycle){
            return;
        }

        slow = head;
        Node prev = null;

        while(slow != fast){
            slow = slow.next;
            prev = fast;
            fast = fast.next;
        }

        prev.next = null;

    }

}
