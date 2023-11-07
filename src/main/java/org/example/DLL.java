package org.example;

public class DLL {

    Node head;

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head != null) {
            head.prev = node;
        }
        head = node;
    }

    public void insertEnd(int val) {
        Node node = new Node(val);
        Node last = head;

        if(head == null) {
            node.prev = null;
            head = node;
            return;
        }
        while(last.next != null) {
            last = last.next;
        }
        last.next = node;
        node.next = null;
        node.prev = last;
        last = node;
    }

    public Node findNode(int value) {
        Node temp = head;
        while(temp != null) {
            if(temp.val == value) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void insert(int afterValue, int value) {
        Node p = findNode(afterValue);
        if( p == null) {
            System.out.println("Node doesn't exists");
            return;
        }
        if(p.next == null) {
            insertEnd(value);
            return;
        }
        Node node = new Node(value);
        node.next = p.next;
        p.next = node;
        node.prev = p;
        node.next.prev = node;
    }

    public void display() {
        Node node = head;
        Node last = null;
        while(node != null) {
            System.out.print(node.val + "->");
            last = node;
            node = node.next;
        }
        System.out.print("END");
        System.out.println("");

        while(last != null) {
            System.out.print(last.val + "->");
            last = last.prev;
        }
        System.out.println("END");

    }
    private class Node {
        int val;
        Node next;
        Node prev;

        public Node(int val) {
            this.val = val;
        }

        public Node(int val, Node next, Node prev) {
            this.val = val;
            this.next = next;
            this.prev = prev;
        }
    }

    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(5);
        list.insertFirst(8);
        list.insertFirst(45);
        list.insertEnd(6);
        list.insert(45, 78);
        list.insert(6, 881);
        list.display();
    }
}
