package Circular_Linked_List;

public class CLL {

    Node head = null;
    Node tail = null;

    void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            tail.next = head;
            return;
        }
        tail.next = newNode;
        newNode.next = head;
        tail = newNode;
    }

    void insertAtBeginning(int data){
        Node newNode = new Node(data);
        if(head == null){
            insert(data);
            return;
        }

        newNode.next = head;
        head = newNode;
        tail.next = head;
    }

    void traverse() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node temp = head;
        do {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        } while (temp != head);

        System.out.println("(back to head)");
    }

}
