import java.util.HashSet;

/**
 * Created by sanjanamanojkumar on 3/30/17.
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        Node a = new Node(2);
        a.addNode(3);
        a.addNode(4);
        a.addNode(5);
        a.addNode(4);
        a.addNode(6);
//        removeDuplicates(a);
        removeDupsWithoutSpace(a);
        a.printList();
    }

    public static void removeDuplicates(Node n) {
        HashSet<Integer> set = new HashSet<Integer>();
        Node previous = null;
        while(n!=null) {
            if(set.contains(n.data)){
                previous.next = n.next;
            }
            else {
                set.add(n.data);
                previous=n;
            }
            n=n.next;
        }

    }

    public static void  removeDupsWithoutSpace(Node n) {
        Node current = n;
        while(current!=null){
            Node runner = current;
            while(runner.next!=null){
                if(runner.next.data == current.data) {
                    runner.next = runner.next.next;
                }
                else {
                    runner=runner.next;
                }
            }
            current = current.next;
        }
    }
}
