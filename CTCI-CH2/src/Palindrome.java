/**
 * Created by sanjanamanojkumar on 6/14/17.
 */
public class Palindrome {

    public static boolean isPalindrome(Node n) {
        Node reversed = reverse(n);
        return isEqual(n,reversed);
    }

    public static Node reverse(Node n){
        Node head =null;
        while(n!=null) {
            Node  temp = new Node(n.data);
            temp.next = head;
            head = temp;
            n = n.next;
        }
        return head;

    }

    public static boolean isEqual(Node l1, Node l2) {
        while(l1!=null && l2!=null){
            if(l1.data !=l2.data) {
                return false;

            }
            l1=l1.next;
            l2=l2.next;
        }
        return l1==null && l2==null;

    }

    public static void main(String[] args){
        Node a = new Node(1);
        a.addNode(2);
        a.addNode(3);
        a.addNode(3);
//        a.addNode(2);
        a.addNode(1);
        System.out.println(isPalindrome(a));
    }
}
