package org.example.LinkedList;

public class SinglyLinkedList {

    private class Node {
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
    }

    private Node head;
    private Node tail;
    private int size;

    public SinglyLinkedList() {
        this.size = 0;
    }

    public void insertAtTheBeginning(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertAtTheEnd(int val) {
        Node node = new Node(val);
        if (tail == null) {
            insertAtTheBeginning(val);
        }
        tail.next = node;
        tail = node;
        node.next = null;
        size += 1;
    }

    public void insert (int val, int index) {
        if(index == 0) {
            insertAtTheBeginning(val);
        }
        if (index == size) {
            insertAtTheEnd(val);
        }
        Node temp = head;
        for(int i=1;i<index;i++) {
            temp = temp.next;
        }
        Node newNode = new Node(val,temp.next);
        temp.next = newNode;
        size++;
    }
    public void deleteFirst() {
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
    }

    public void deleteLast() {
        Node temp = head;
        while(temp != null) {
            if (temp.next.next == null) {
                temp.next = null;
                break;
            }
            temp = temp.next;
        }
        size--;
    }

    public Node getNode(int index) {
        Node node = head;
        for (int i=0;i<index;i++) {
            node = node.next;
        }
        return node;
    }

    public void delete(int index) {
        if (index == 0) {
            deleteFirst();
        }
        if(index == size) {
            deleteLast();
        }
        Node temp = getNode(index-2);
        temp.next = temp.next.next;
    }

    public void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }
}
