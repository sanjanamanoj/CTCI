/**
 * Created by sanjanamanojkumar on 6/13/17.
 */
public class Intersection {

    class Result {
        int length;
        Node n = null;

        public Result(Node a, int size) {
            this.length = size;
            this.n = a;
        }
    }

    public  Result getSizeAndTail(Node head) {
        if(head ==null) {
            return null;
        }
        Node current = head;
        int size =1;
        while(current.next!=null) {
            size++;
            current = current.next;
        }
        return (new Result(current,size));
    }

    public Node getKthNode( Node head,int k) {
        Node current =head;
        while(k>0 && current!=null){
            current = current.next;
            k--;
        }
        return current;
    }

    public Node findIntersection(Node list1, Node list2) {
        if(list1==null || list2 ==null) {
            return null;
        }
        Result r1 = getSizeAndTail(list1);
        Result r2 = getSizeAndTail(list2);

        if(r1.n != r2.n) {
            return null;
        }

        Node shorter = r1.length <= r2.length ? list1 :list2;
        Node longer =  r1.length > r2.length ? list1 :list2;

        longer = getKthNode(longer, Math.abs(r1.length - r2.length));

        while(shorter!=longer) {
            shorter=shorter.next;
            longer =longer.next;
        }
        return longer;
    }

    public static void main(String[] args) {
        Intersection i = new Intersection();
        Node a = new Node(5);
        a.addNode(6);
        a.addNode(7);
        a.addNode(8);
        a.addNode(9);

        Node b = new Node(4);
        b.addNode(3);
        b.next.next=a.next.next;
        Node n = i.findIntersection(a,b);
        System.out.println(n.data);

    }
}
