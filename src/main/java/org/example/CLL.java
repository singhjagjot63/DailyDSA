package org.example;

public class CLL {

    private Node head;
    private Node tail;

    public void insert(int val) {
        Node node = new Node(val);
        if(head == null) {
            head = node;
            tail = node;
            return;
        }
        tail.next = node;
        node.next = head;
        tail = node;
    }

    public void delete(int value) {
        Node temp = head;
        if(head == null) {
            return;
        }
        if(value == head.val) {
            head = head.next;
            tail.next = head;
            return;
        }
        do {
            Node n = temp.next;
            if(n.val == value) {
                temp.next = n.next;
                break;
            }
            temp = temp.next;
        } while(temp != head);

    }

    public void display() {
        Node node = head;
        if(head != null) {
            do{
            System.out.print(node.val + "->");
            node = node.next;}while(node != head);
        }

    }

    private class Node {
        int val;
        Node next;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next) {
            this.val = val;
            this.next = next;
        }
    }

    public static void main(String[] args) {
        CLL cl = new CLL();
        cl.insert(56);
        cl.insert(89);
        cl.insert(2);
        cl.delete(89);
        cl.display();
    }
}
