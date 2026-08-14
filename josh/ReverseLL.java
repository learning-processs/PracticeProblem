package josh;

public class ReverseLL {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }
    // Before: 1 -> 2 -> 3 -> 4
    // After:  4 -> 3 -> 2 -> 1
    static Node reverseIterative(Node head){

        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
    public static void main(String[] args) {
        Node head = new Node(1);

        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);

        head = reverseIterative(head);
    }
}
