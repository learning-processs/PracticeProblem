package josh;

public class InsertionTwoLL {

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }
    }

    // static Node getIntersection(Node headA, Node headB){

    //     Node a = headA;
    //     Node b = headB;

    //     while (a != b) {
            
    //         if( a == null){
    //             a = headB;
    //         }else{ 
    //             a = a.next;
    //         }

    //         if( b == null){
    //             b = headA;
    //         }else{
    //             b = b.next;
    //         }
    //     }
    //     return a;
    // }

    public static Node getIntersection(Node headA, Node headB){
        Node a = headA;
        Node b = headB;

        while (a != b) {
            if( a == null){
                a = headB;
            }else{
                a = a.next;
            }

            if(b == null){
               b = headA;
            }else{
               b = b.next;
            }
        }

        return a;
    }
    public static void main(String[] args) {
        
        Node common = new Node(7);
        common.next = new Node(8);

        Node headA = new Node(1);
        headA.next = new Node(2);
        headA.next.next = common;

        Node headB = new Node(4);
        headB.next = new Node(5);
        headB.next.next = common;

        Node result = getIntersection(headA, headB);

        if (result != null) {
            System.out.println(
                "Intersection: " + result.data
            );
        } else {
            System.out.println("No intersection");
        }
    }
}
