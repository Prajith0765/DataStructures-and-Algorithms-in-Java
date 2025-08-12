package Doubly_Linked_List;

public class Main {
    public static void main(String[] args) {

        DLL dlist = new DLL();

        dlist.insert(1);
        dlist.insert(2);
        dlist.insert(3);
        dlist.insert(4);
        dlist.traverseList();
        System.out.println();

        dlist.insertAtBeginning(7);
        dlist.insertAtBeginning(8);
        dlist.traverseList();
        System.out.println();

        dlist.insertAtPosition(19, 3);
        dlist.insertAtPosition(88, 4);
        dlist.traverseList();
        System.out.println();

        dlist.delete(19);
        dlist.traverseList();
        System.out.println();

        dlist.reverse();
        dlist.traverseList();

    }
}
