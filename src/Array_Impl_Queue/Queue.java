package Array_Impl_Queue;

public class Queue {

    int capacity;
    int size;
    int front;
    int rear;
    int[] queue;

    Queue(int capacity){
        this.capacity = capacity;
        this.queue = new int[capacity];
        this.size = 0;
        this.front = 0;
        this.rear = -1;
    }

    void enqueue(int data){

        if(rear != capacity){
            queue[++rear] = data;
            return;
        } else {
            queue[front++] = data;
        }
    }

    void dequeue(){
        if(front < rear){
            System.out.println("Value Removed" + queue[front]);
            front++;
        }
        System.out.println();
    }

    void display(){

        for(int i = 0; i <= rear; i++){
            System.out.print(queue[i] + " ");
        }
    }
}
