package DSA_College;

import java.util.NoSuchElementException;

public class CircularLinkedList {
    Node tail;
    private int size = 0;

    private static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
        }
    }

    // insert last
    public void add(int data) {
        Node node = new Node(data);
        if (tail == null) {
            tail = node;
            node.next = node;
        } else {
            node.next = tail.next;
            tail.next = node;
            tail = node;
        }
        size++;
    }
    // insert first
    public void addFirst(int data) {
        Node node = new Node(data);
        if (isEmpty()) {
            add(data);

        } else {
            node.next = tail.next;
            tail.next = node;
        }
        size ++;
    }
    // insert at
    public void add(int index, int data) {
        Node node = new Node(data);
        if (isEmpty())
            add(data);
        if (index == 0)
            addFirst(data);
        else if (index == size)
            add(data);
        else {
            Node n = tail.next;
            int i = 0;
            while (i < index - 1) {
                n = n.next;
                i ++;
            }
            node.next = n.next;
            n.next = node;
        }
        size ++;
    }
    // delete last
    public int delete() {
        if (isEmpty())
            throw new NoSuchElementException("Empty List!!");
        int data = tail.data;
        Node n = tail;
        while (n.next != tail) {
            n = n.next;
        }
        n.next = tail.next;
        tail = n;
        size --;
        return data;
    }
    // delete first
    public int deleteFirst() {
        if (isEmpty())
            delete();
        Node node = tail.next;
        tail.next = tail.next.next;
        node.next = null;
        size --;
        return node.data;
    }
    public int delete(int index) {
        int i = 0;
        Node n = tail.next;
        while (i < index - 1) {
            n = n.next;
            i ++;
        }
        int data = n.next.data;
        n.next = n.next.next;
        size --;
        return data;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void display() {
        Node n = tail.next;
        for (int i = 0; i < size; i++) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println(n.data);
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.add(1);
        cll.add(2);
        cll.add(3);
        cll.display();
        cll.addFirst(0);
        cll.display();
        cll.add(1, 10);
        cll.display();
        System.out.println(cll.delete());
        cll.display();
        System.out.println(cll.deleteFirst());
        cll.display();
        System.out.println(cll.delete(2));
        cll.display();
    }
}
