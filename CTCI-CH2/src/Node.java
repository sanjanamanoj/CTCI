/**
 * Created by sanjanamanojkumar on 3/30/17.
 */


public class Node {
    int data;
    Node next = null;

    public Node(int d) {
        this.data = d;
    }

    public void addNode(int d) {
        Node n = new Node(d);
        Node current = this;
        while(current.next!=null) {
            current = current.next;
        }
        current.next = n;
    }

    public void add(Node a) {
        Node current = this;
        while(current.next!=null) {
            current = current.next;
        }
        current.next = a;
    }

    public Node deleteNode(int d) {
        Node head = this;
        Node current = this;
        if(current.data == d) {
            return current.next;
        }
        else {
            while(current.next!=null){
                if(current.next.data == d) {
                    current.next = current.next.next;
                    return head;
                }
                current=current.next;
            }


        }
        return head;
    }


    public void printList() {
        Node current = this;
        while(current!=null) {
            System.out.println(current.data);
            current = current.next;
        }

    }

    public static void main(String[] args) {
        Node n = new Node(5);
        n.addNode(6);
        n.addNode(7);
        n.printList();
        Node f =n.deleteNode(7);
        f.printList();
//        Node b = new Node(8);
//        b.addNode(9);
//        b.printList();


    }
}