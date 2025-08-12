package Singly_linked_list;


public class SLList {
    Node head = null;
    Node tail = null;

    public void insertNode(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    void insertAtBeginning(int data){
        Node newNode = new Node(data);

        if(head == null){
            insertNode(data);
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    void insertAtPosition(int data, int position){
        Node newNode = new Node(data);
        if(position == 1){
            insertNode(data);
            return;
        }

        Node temp = head;
        for(int i = 0; i < position - 1 && temp != null; i++){
            temp = temp.next;
        }
        newNode.next = temp.next;
        temp.next = newNode;

        if(newNode.next == null){
            tail = newNode;
        }

    }

    void Traverse(){
        Node temp = head;

        while(temp != null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
    }

    void search(int data){
        Node temp = head;
        int index = 1;
        while(temp != null){
            if(temp.data == data){
                System.out.println(data + " Found At Index : " + index);
                return;
            }
            index++;
            temp = temp.next;
        }

        System.out.println("Not Found!");
    }

    void deleteSpecific(int data){
        Node temp = head;
        Node previous = null;
        while(temp != null){
            if(temp.data == data){
                if(previous == null){
                    head = temp.next;
                } else {
                    previous.next = temp.next;
                }
                if(temp.next == null){
                    tail = previous;
                }
            }
            previous = temp;
            temp = temp.next;

        }


    }

    void reverseList(){
        Node current = head;
        Node previous = null;
        Node nextNode;
        while (current != null){
            nextNode = current.next;
            current.next = previous;
            previous = current;
            current = nextNode;
        }

        head = previous;
    }
}
