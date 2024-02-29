package LinkedList;

public class ReverseLL {
    public static void display(Node head){ 
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }
    public static class Node {
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }  
    }
    public static Node reverse(Node head){
        Node curr = head;
        Node prev = null;
        Node after = null;
        while(curr != null){
            after = curr.next;
            curr.next = prev;
            prev = curr;
            curr = after;
        }
        return prev;
    }

    public static void main(String[] args) {
        Node a =  new Node(5);
        Node b =  new Node(3);
        Node c =  new Node(9);
        Node d =  new Node(8);
        Node e =  new Node(16);
        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = null;
        display(a);
        System.out.println();
        a = reverse(a);
        display(a);
        System.out.println();
    }
}
