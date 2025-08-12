package LinkedList_Implementation_Stack;

public class Stack {
    Node head = null;

    void push(int data){
        Node newNode = new Node(data);

        if(head == null){
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    void pop(){

        if(head == null){
            System.out.println("Stack UnderFlow!!");
            return;
        } else{
            head = head.next;
            System.out.println("Top Element Popped!!");
        }
    }

    void peek(){
        if(head == null){
            System.out.println("Stack UnderFlow");
        } else {
            System.out.println(head.data);
        }
    }

    void isEmpty(){

        if(head == null){
            System.out.println("Stack is Empty!");
        } else{
            System.out.println("Stack is Not Empty!!!");
        }
    }

    void display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data + "  ");
            temp = temp.next;
        }
    }


}
