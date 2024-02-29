import java.util.Scanner;

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    // Method to reverse the linked list
    public void reverse() {
        Node prev = null;
        Node current = head;
        Node next = null;

        while (current != null) {
            next = current.next; // Save the next node
            current.next = prev; // Reverse the link
            prev = current; // Move prev to the current node
            current = next; // Move current to the next node
        }

        head = prev; // Update the head to the last node (previously the last node becomes the first node)
    }

    // Method to insert a new node at the beginning of the linked list
    public void insert(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    // Method to display the linked list
    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class LL {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        LinkedList list = new LinkedList();

        while(true){
            int num = sc.nextInt();

            if(num == -1){
                break;
            }

            list.insert(num);
        }

        // Inserting elements into the linked list
        
        // list.insert(1);
        // list.insert(2);
        
        // list.insert(3);
        // list.insert(4);
        // list.insert(5);

        System.out.println("Original linked list:");
        list.display();
        // Reversing the linked list
        list.reverse();
        System.out.println("Reversed linked list:");
        list.display();
        sc.close();
    }
}
