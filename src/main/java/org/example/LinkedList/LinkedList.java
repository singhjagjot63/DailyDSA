package org.example.LinkedList;

public class LinkedList {
    public static void main(String[] args) {
        SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
        singlyLinkedList.insertAtTheBeginning(5);
        singlyLinkedList.insertAtTheBeginning(3);
        singlyLinkedList.insertAtTheBeginning(1);
        singlyLinkedList.insertAtTheEnd(12);
        singlyLinkedList.insertAtTheEnd(156);
        singlyLinkedList.insertAtTheEnd(789);
        singlyLinkedList.insert(98,2);
        singlyLinkedList.display();
       // singlyLinkedList.deleteFirst();
       // singlyLinkedList.display();
       // singlyLinkedList.deleteLast();
        //singlyLinkedList.display();
        singlyLinkedList.delete(3);
        singlyLinkedList.display();

    }
}
