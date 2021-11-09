package CircularDoublyLinkedList;

public class CircularDoublyLinkedList {
    private static class Node {
        int data;
        Node prev;
        Node next;

        public Node(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    Node head;
    Node tail;
    int size = 0;

    public void insert(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = tail = node;
        } else {
            node.prev = tail;
            tail.next = node;
            tail = node;
            node.next = head;
        }
        size++;
    }

    public void insertFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = tail = node;
        } else {
            node.next = head;
            node.prev = null;
            head = node;
            size++;
        }
    }

    public void display() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        CircularDoublyLinkedList cdll = new CircularDoublyLinkedList();
        cdll.insert(10);
        cdll.insert(20);
        cdll.insert(30);
        cdll.insert(40);
        cdll.insertFirst(5);
        cdll.display();
    }
}
