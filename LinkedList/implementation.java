package LinkedList;

public class implementation {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static class linkedlist{
        Node head = null;
        Node tail = null;
        int size = 0;

        void insertAtEnd(int val){
            Node temp = new Node(val);
            if(head == null){
                head = temp;
            }else{
                tail.next = temp;

            }
            tail = temp;
            size++;
        }

        void insertAtHead(int val){
            Node temp = new Node(val);
            if(head == null){
                insertAtEnd(val);
            }else{
                temp.next = head;
                head = temp;
            }
            size++;
        }

        void insertAt(int idx, int val){
            Node t = new Node(val);
            Node temp = head;
            if(idx == size){
                insertAtEnd(val);
                return;
            }else if(idx == 0){
                insertAtHead(val);
                return;
            }else if(idx < 0 || idx > size){
                System.out.println("wrong index");
                return;
            }

            for(int i=1; i<idx-1; i++){
                temp = temp.next;
            }
            t.next = temp.next;
            temp.next = t;
            size++;
        }
        

        int getAt(int idx){
            if(idx < 0 || idx > size){
                System.out.println("wrong index");
                return -1;
            }
            Node temp = head;
            for(int i=1; i<=idx; i++){
                temp = temp.next;
            }
            return temp.data;
        }

        void display(){
            Node temp = head;
            while (temp != null) {
                System.out.print(temp.data + " ");
                temp = temp.next;
            }
        }

        public Node reverseList(Node head) {
            if(head == null || head.next==null){
                return head;
            }
            Node current = head;
            Node prev = null;
            Node next = current.next;
    
            while(current != null){
                next = current.next;
                current.next = prev;
                prev = current;
                current = next;
                
            }
            return prev;
            
        }

        // int size(){
        //     Node temp = head;
        //     int count = 0;
        //     while (temp != null) {
        //         count++;
        //         temp = temp.next; 
        //     }
        //     return count;
        // }

    }

    public static void main(String[] args) {
        linkedlist ll = new linkedlist();
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.insertAtEnd(6);
        ll.insertAtHead(20);
        ll.insertAtHead(25);
        
        ll.insertAt(2,50);
        ll.display();
        System.out.println();
        System.out.println(ll.size);
        System.out.println("find index "+ll.getAt(3));
        ll.reverseList(null);
        ll.display();
    }
}
