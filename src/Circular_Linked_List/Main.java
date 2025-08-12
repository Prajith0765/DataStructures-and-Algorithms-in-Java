package Circular_Linked_List;

public class Main {
    public static void main(String[] args) {
        CLL clist = new CLL();

        clist.insert(1);
        clist.insert(2);
        clist.insert(3);
        clist.insert(4);
        clist.traverse();
        System.out.println();

        clist.insertAtBeginning(5);
        clist.insertAtBeginning(8);
        clist.traverse();
    }
}
