 class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        next = null;
    }
 }

public class RotateLL {

    static Node rotate(Node head ,int k){

        if(k == 0 || head == null|| head.next == null ){
            return head;
        }


        Node first = head;
        head = head.next;
    }


    private static void printList(Node node) {
        while (node != null) {
            System.out.println(node.data);
            if(node.next != null){
                System.out.println(" -> ");
            }
            node = node.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        head = rotate(head, 6);
        printList(head);
    }
    
}
