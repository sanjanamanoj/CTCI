/**
 * Created by sanjanamanojkumar on 6/14/17.
 */
public class SumLists {

    public static Node addLists(Node l1, Node l2, int carry) {
        if(l1==null && l2==null && carry==0)
            return null;

        int value = carry;
        if(l1!=null) {
            value+=l1.data;
        }
        if(l2!=null) {
            value+=l2.data;
        }
        Node result = new Node(value%10);
//        result.data = value%10;
        if(l1!=null || l2!=null) {
            Node more = addLists(l1==null ? null : l1.next, l2==null? null : l2.next, value>=10 ? 1 :0);
            result.next = more;
        }
        return result;
    }

    public static void main(String[] args) {
        Node a = new Node(7);
        a.addNode(1);
        a.addNode(6);
        Node b = new Node(5);
        b.addNode(9);
        b.addNode(2);
        Node n =addLists(a,b,0);
        n.printList();
    }
}
