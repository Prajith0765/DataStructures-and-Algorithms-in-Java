package Array_Implementation_Stack;

public class Stack {

    int size;
    int top = -1;
    int[] arr;

    Stack(int size){
        this.size = size;
        this.arr = new int[size];
    }

    void push(int data){
        if(top < size - 1){
            arr[++top] = data;
            return;
        } else{
            System.out.println("Stack Overflow");
        }
    }

    void pop(){
        if(top == -1){
            System.out.println("Stack UnderFlow");
        } else {
            System.out.println(arr[top--]);
        }
    }

    void peek(){
        if(top == -1){
            System.out.println("Stack UnderFlow");
        } else{
            System.out.println(arr[top]);
        }
    }

    void isEmpty(){
        if(top == -1){
            System.out.println("Stack is Empty!!");
        } else{
            System.out.println("Stack Contain Elements, Not Empty!!!");
        }
    }
}
