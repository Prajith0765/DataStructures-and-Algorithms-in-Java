package Doubly_Linked_List;

public class DLL {

    Node head = null;
    Node tail = null;

    void insert(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }
        newNode.previous = tail;
        tail.next = newNode;
        tail = newNode;
    }

    void insertAtBeginning(int data){
        Node newNode = new Node(data);
        if(head == null){
            insert(data);
            return;
        }
        newNode.next = head;
        head.previous = newNode;
        head = newNode;
    }

    void insertAtPosition(int data, int position){
        Node newNode = new Node(data);
        if(position == 1){
            insertAtBeginning(data);
            return;
        }
        Node temp = head;
        for(int i = 1; i < position - 1 && temp != null; i++){
            temp = temp.next;
        }
        if (temp == null) {
            System.out.println("Position out of bounds");
            return;
        }

        newNode.next = temp.next;
        newNode.previous = temp;
        if (temp.next != null) {
            temp.next.previous = newNode;
        } else {
            tail = newNode; // inserting at the end
        }

        temp.next = newNode;
    }

    void delete(int data){
        Node temp = head;
        while(temp != null){
            if(temp.data == data){
                if(temp.previous == null){ // deleting head
                    head = temp.next;
                    if(head != null){
                        head.previous = null;
                    } else {
                        tail = null; // list became empty
                    }
                    return;
                }
                else if(temp.next == null){ // deleting tail
                    tail = temp.previous;
                    tail.next = null;
                    return;
                }  else {
                    temp.next.previous = temp.previous;
                    temp.previous.next = temp.next;
                }
            }
            temp = temp.next;
        }
    }

    void search(int data){
        Node temp = head;
        int index = 0;
        while(temp != null){
            index++;
            if(temp.data == data){
                System.out.print(data + " Found at Position : " + index);
                return;
            }
            temp = temp.next;
        }

        System.out.println(data + " Not Found!!");
    }

    void traverseList(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }

    }

    void reverse(){
        Node current = head;
        Node temp = null;

        while(current != null){
            temp = current.previous;
            current.previous = current.next;
            current.next = temp;
            current = current.previous;
        }

        if(temp != null){
            head = temp.previous;
        }
    }

}
