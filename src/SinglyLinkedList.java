import java.util.*;
class Node{
    int data;
    Node next;

    Node(int data){
        this.data = data;
        this.next = null;
    }
}

class List{
    Node head = null;
    Node tail = null;

    public void insertAtEnd(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = tail.next;
        tail.next = null;
        return;
    }

    public void insertAtBeginning(int data){
        Node newNode = new Node(data);
        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
        return;
    }

    public void insertAtMiddle(int position, int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode; // If list is empty, new node becomes both head and tail
            return;
        }

        Node temp = head;
        for (int i = 1; i < position - 1 && temp != null; i++) {
            temp = temp.next; // Move temp to the node just before the insertion point
        }

        if (temp == null) {
            System.out.println("Invalid position"); // Handle position out of bounds
            return;
        }

        newNode.next = temp.next; // Point new node to the next node
        temp.next = newNode; // Point current node to the new node

        if (temp == tail) {
            tail = newNode; // Update tail if new node is inserted at the end
        }
    }


    public void reverse() {
        Node tempnode = null;
        Node current = head; // Use a temporary pointer to traverse

        while (current != null) {
            Node temp = current.next;
            current.next = tempnode;
            tempnode = current;
            current = temp;
        }

        // Update head to the new first node
        head = tempnode;

        // Print the reversed list
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }


    public void delete(int data){
        Node temp = head;
        while(temp != null){
            if(temp.next.data == data){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
        return;
    }

    public void search(int data){
        Node temp = head;
        int i = 1;
        while(temp != null){
            if(temp.data == data){

                System.out.println("Element at index: " + i);
                return;
            }
            i++;
            temp = temp.next;
        }

        System.out.println("Element not found");
        return;
    }

    public void printList(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        return;
    }
}


public class SinglyLinkedList {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        List list = new List();
        while (true) {
            System.out.println("Enter 1 for Insert At end \n" +
                               "Enter 2 for Insert At Beginning \n" +
                                "Enter 3 for Insert At Middle \n" +
                                "Enter 4 for Reverse List \n" +
                                "Enter 5 for Delete List \n" +
                                "Enter 6 for Search Elements \n" +
                                "Enter 7 for Print List \n" +
                                "Enter 8 for Exit...");
            int choice = in.nextInt();
            switch(choice) {
                case 1:
                    list.insertAtEnd(in.nextInt());
                    break;
                case 2:
                    list.insertAtBeginning(in.nextInt());
                    break;

                case 3:
                    int position = in.nextInt();
                    int data = in.nextInt();
                    list.insertAtMiddle(position, data);
                    break;
                case 4:
                    list.reverse();
                    break;
                case 5:
                    list.delete(in.nextInt());
                    break;
                case 6:
                    list.search(in.nextInt());
                    break;
                case 7:
                    list.printList();
                    break;
                case 8:
                    return;

                default:
                    System.out.println("Enter Valid Choice....");
                    break;
            }
            System.out.println("-----------------");
        }

    }
}
