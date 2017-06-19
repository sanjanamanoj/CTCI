/**
 * Created by sanjanamanojkumar on 6/13/17.
 */
public class KthToLast {

    public static Node kthToLast(Node n, int k) {
        Node p1 =n;
        Node p2 = n;

        for(int i=0; i<k;i++) {
            if(p1!=null) {
                p1=p1.next;
            }
            else {
                return null;
            }
        }

        while(p1!=null) {
            p1=p1.next;
            p2=p2.next;
        }
        return p2;

    }

    public static void main(String[] args) {
        Node a = new Node(5);
        a.addNode(6);
        a.addNode(7);
        a.addNode(8);
        Node n=kthToLast(a,3);
        System.out.println(n.data);
    }
}
