/**
 * Created by sanjanamanojkumar on 6/13/17.
 */
public class LoopDetection {

    public static Node findLoopStart(Node head) {
        Node slow = head;
        Node fast = head;

        while(fast.next.next!=null){
            slow = slow.next;
            fast=fast.next.next;
            if(slow == fast) {
                break;
            }
        }

        if(fast ==null || fast.next==null) {
            return null;
        }

        slow=head;
        while(slow!= fast) {
            slow = slow.next;
            fast = fast.next;
        }
        return fast;
    }


    public static void main(String[] args) {
        Node a = new Node(5);
        a.next = new Node(6);
        a.next.next = new Node(7);
        a.next.next.next = new Node(8);
        a.next.next.next.next = new Node(9);
        a.next.next.next.next.next = new Node(10);
        a.next.next.next.next.next.next =  a.next.next;
        System.out.println(findLoopStart(a).data);


    }
}
