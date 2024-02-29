package LinkedList;

public class basicll {
    public static void display(Node head){ 
        while(head != null){
            System.out.print(head.data + " ");
            head = head.next;
        }
    }

    public static void displayReverse(Node head){
        
        if(head == null) return;
        displayReverse(head.next);
        System.out.print(head.data + " ");
    }

    public static int length(Node head){
        int count = 0;
        while(head != null){
            count++;
            head = head.next;
        }
        return count;

    }
    public static class Node {
        int data;
        Node next;

        Node(int data){
            this.data = data;
        }  
    }

    // public Node reverseList(Node head) {
    //     if(head == null || head.next==null){
    //         return head;
    //     }
    //     Node current = head;
    //     Node prev = null;
    //     Node next = current.next;

    //     while(current != null){
    //         next = current.next;
    //         current.next = prev;
    //         prev = current;
    //         current = next;
            
    //     }
    //     return prev; 
    // }

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
        // if(head.next == null){
        //     return head;
        // }
        // Node newHead =  reverse(head.next);
        //     head.next = null;
        //     return newHead;
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
        // displayReverse(a);

        System.out.println();
        // System.out.println("length: "+length(a));

        // Node temp = a;

        // while(temp != null){
        //     System.out.print(temp.data+ " ");
        //     temp = temp.next;  
        // }

        // for(int i=1; i<=5; i++){
        //     System.out.print(temp.data+ " ");
        //     temp = temp.next;   
        // }
        // System.out.println(a.data);
        // System.out.println(a.next.data);
        // System.out.println(a.next.next.data);


    }

}
