/**
 * Created by sanjanamanojkumar on 6/14/17.
 */
public class DeleteMiddleNode {

    public static boolean delete(Node n) {
        if(n==null || n.next == null) {
            return false;
        }
        Node next = n.next;
        n.data = next.data;
        n.next= next.next;
        return true;

    }

    public static void main(String[] args) {
        Node a = new Node(5);
        Node b = new Node(7);
        a.next = new Node(6);
        a.next.next= b;
        b.next = new Node(8);
        delete(b);
        a.printList();
    }
}
