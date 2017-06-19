/**
 * Created by sanjanamanojkumar on 6/14/17.
 */
public class Partition {

    public static Node partition (Node n, int x) {
        Node beforeStart = null;
        Node beforeEnd = null;
        Node afterStart = null;
        Node afterEnd =null;

        while(n!=null) {
            Node next = n.next;
            n.next=null;
            if(n.data <x) {
                if(beforeStart==null){
                    beforeStart = n;
                    beforeEnd = beforeStart;
                }
                else {
                    beforeEnd.next = n;
                    beforeEnd = n;
                }
            }

            else {
                if(afterStart == null) {
                    afterStart = n;
                    afterEnd = afterStart;
                }
                else {
                    afterEnd.next=n;
                    afterEnd = n;
                }
            }
            n=next;
        }
        if(beforeStart == null)
            return afterStart;
        beforeEnd.next = afterStart;
        return beforeStart;
    }

    public static void main(String[] args) {
        Node a = new Node(3);
        a.addNode(5);
        a.addNode(8);
        a.addNode(5);
        a.addNode(10);
        a.addNode(2);
        a.addNode(1);
        Node n = partition(a,5);
        n.printList();
    }

}
