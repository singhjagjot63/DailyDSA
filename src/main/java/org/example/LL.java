package org.example;

public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;

        if(tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void insertLast(int val) {
        Node node = new Node(val);
        if (tail == null) {
            insertFirst(val);
        }
        tail.next = node;
        tail = node;
        size += 1;
    }

    public void insert(int val, int index) {
        if(index == 0) {
            insertFirst(val);
        }
        if(index == size) {
            insertLast(val);
        }
        Node temp = head;
        for(int i=1;i< index;i++) {
            temp = temp.next;
        }
        Node node = new Node(val, temp.next);
        temp.next = node;
        size ++;
    }

    public int deleteFirst() {
        int val = head.value;
        head = head.next;
        if(head == null) {
            tail = null;
        }
        size --;
        return val;
    }

    public int deleteLast() {
        if(size <= 1) {
            return deleteFirst();
        }
        int val = tail.value;
        Node temp = head;
        for(int i=1;i<size;i++) {
            if(null != temp.next && temp.next == tail) {
                tail = temp;
                tail.next = null;
            }
            temp = temp.next;
        }
        size--;
        return val;
    }

    public Node get(int index) {
        Node node = head;
        for(int i=0;i<index;i++) {
            node = node.next;
        }
        return node;
    }

    public int delete(int index) {
        if(index == 0) {
            deleteFirst();
        }
        if(index == size-1) {
            return deleteLast();
        }
        Node prev = get(index-2);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public Node findNode(int val) {
        Node temp = head;
        while(temp != null) {
            if(temp.value == val) {
                return temp;
            }
            temp = temp.next;
        }
        return null;
    }

    public void display() {
        Node temp = head;
        while(temp != null) {
            System.out.print(temp.value + "->");
            temp = temp.next;
        }
        System.out.println("END");
    }

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

    public static void main(String[] args) {
        LL LL = new LL();
        LL.insertFirst(5);
        LL.insertFirst(3);
        LL.insertFirst(7);
        LL.insertFirst(9);
        LL.display();
        LL.insertLast(17);
        LL.display();
        LL.insert(0,2);
        LL.display();
        LL.delete(3);
        LL.display();
        System.out.println(LL.findNode(7));
    }
}
