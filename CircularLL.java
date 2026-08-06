/**
 * Node
 */

class Node {

    public int data;
    Node next;

    public Node(int data){
        this.data = data;
        next = null;
    } 
}

public class CircularLL {

    public static void print(Node curr , Node head){

        if(head ==null){
            return;
        }

        System.out.println(curr.data + " ");
        if(curr.next == head){
            return;
        }
        print(curr.next, head);
    }

    public static void printList(Node head){
        print(head , head);
    }


    public static void main(String[] args) {
        Node head = new Node(11);
        head.next = new Node(2);
        head.next.next = new Node(56);
        head.next.next.next = new Node(12);

        head.next.next.next.next = head;

        printList(head);
    }
}
