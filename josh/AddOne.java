package josh;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}
public class AddOne {

    static Node addOne(Node head) {

        // Reverse because addition starts from last digit
        head = reverse(head);

        Node current = head;
        int carry = 1;

        while (current != null && carry > 0) {

            int sum = current.data + carry;

            current.data = sum % 10;
            carry = sum / 10;

            if (current.next == null && carry > 0) {
                current.next = new Node(carry);
                carry = 0;
            }

            current = current.next;
        }

        // Restore original order
        return reverse(head);
    }

    public static Node reverse(Node head){

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

    static void printList(Node head) {

        while (head != null) {
            System.out.print(head.data);

            if (head.next != null) {
                System.out.print(" -> ");
            }

            head = head.next;
        }

        System.out.println();
    }
    public static void main(String[] args) {
        Node head = new Node(1);
        head.next = new Node(2);
        head.next.next = new Node(9);

        System.out.print("Before: ");
        printList(head);

        head = addOne(head);

        System.out.print("After:  ");
        printList(head);
    }
}
