package Singly_linked_list;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //int n = in.nextInt();

        SLList l = new SLList();
        l.insertNode(3);
        l.insertNode(5);
        l.insertNode(7);
        l.insertAtBeginning(9);
        l.Traverse();

        System.out.println();
        l.search(3);

        l.insertAtPosition(8, 3);
        l.Traverse();
        System.out.println();
        l.deleteSpecific(5);
        l.Traverse();
        System.out.println();

        l.reverseList();
        l.Traverse();
    }


}
