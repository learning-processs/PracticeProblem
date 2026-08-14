// package josh;

// // ⭐ Linked list: update node value with sum of itself + (n−k)th node from end

// class Node{
//     int data ;
//     Node next;

//     Node(int data){
//         this.data = data;
//     }
// }

// public class UpdateNMinusK {

//     public static void update(Node head, int k){

//         // Find length
//         int n = 0;
//         Node temp = head;

//         while (temp != null) {
//             n++;
//             temp = temp.next;
//         }

//         // Find Node from beginning...
//         Node first = head;
//         for(int i = 1 ; i < k ; i++){
//             first = first.next;
//         }

//         int res = n - k;

//         int position = n - res + 1;
//         Node second = head;

//         for(int i = 1 ; i < position ; i++){
//             second = second.next;
//         }

//         first.data = first.data + second.data;

//     }

//     public static void print(Node head){

//         Node temp = head;

//         while (temp != null) {
//             System.out.print(temp.data + " ");
//             temp = temp.next;
//         }
//     }
//     public static void main(String[] args) {
//         Node head = new Node(1);
//         head.next = new Node(2);
//         head.next.next = new Node(3);
//         head.next.next.next = new Node(4);
//         head.next.next.next.next = new Node(5);

//         int k = 2;

//         update(head, k);
//         print(head);
//     }
    
// }

package josh;

class Node{
    int data ;
    Node next;

    Node(int data){
        this.data = data;
    }
}
class UpdateNMinusK {
    public static int update(Node head , int k){
        int n = 0;
        Node temp = head;

        while (temp != null) {
            n++;
            temp  = temp.next;
        }

        Node first = head;
        for(int i = 1 ; i < k ; i++){
            first = first.next;
        }

        int res = n - k;
        int pos = n - res + 1;

        Node second = head;
        for(int i = 1; i < pos ; i++){
            second = second.next;
        }

        return first.data = first.data + second.data;
    }

    public static void print(Node head){
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(3);
        head.next.next.next = new Node(4);
        head.next.next.next.next = new Node(5);
        int k = 2;
        update(head, k);
        print(head);
    }
}