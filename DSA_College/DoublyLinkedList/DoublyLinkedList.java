package DSA_College.DoublyLinkedList;

public class DoublyLinkedList {
    ListNode head;
    ListNode tail;
    int size = 0;

    DoublyLinkedList() {
        this.head = null;
        this.tail = null;
        this.size = 0;
    }

    // ListNode class
    private static class ListNode {
        int data;
        ListNode prev;
        ListNode next;

        ListNode(int data) {
            this.data = data;
            this.prev = null;
            this.next = null;
        }
    }

    // add node at start
    public void insertFirst(int data) {
        ListNode node = new ListNode(data);
        if (head == null) {
            head = node;
            node.next = null;
            tail = node;
        } else {
            node.next = head;
            node.prev = null;
            head = node;
        }
        size ++;
    }

    // insert at index
    public void insert(int index, int data) {
        ListNode node = new ListNode(data);
        if (head == null) {
            insertFirst(data);
        } else {
            ListNode n = head;
            int i = 0;
            while (i < index - 1) {
                n = n.next;
                i ++;
            }
            node.next = n.next;
            n.next.prev = node;
            n.next = node;
            node.prev = n;
        }
        size ++;
    }

    // insert at last
    public void insertLast(int data) {
        ListNode node = new ListNode(data);
        if (head == null) {
            insertFirst(data);
        } else {
            node.prev = tail;
            tail.next = node;
            node.next = null;
            tail = node;
            size++;
        }
    }

    // returns size of the linked list
    public int size() {
        return size;
    }

    // method to check is linked list empty or not
    public boolean isEmpty() {
        return size == 0;
    }

    // display forward
    public void displayForward() {
        ListNode n = head;
        while (n != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println("null");
    }

    // display backward
    public void displayBackward() {
        ListNode n = tail;
        while (n != null) {
            System.out.print(n.data + " -> ");
            n = n.prev;
        }
        System.out.println("null");
    }

    // delete at first
    public int deleteFirst() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return -1;
        }
        if (head == tail) {
            int data = head.data;
            head = tail = null;
            return data;
        }
        int data = head.data;
        head = head.next;
        head.prev = null;
        return data;
    }

    // delete last
    public int deleteLast() {
        if (isEmpty()) {
            System.out.println("List is Empty");
            return -1;
        }
        if (head == tail) {
            int data = head.data;
            head = tail = null;
            return data;
        }
        int data = tail.data;
        tail = tail.next;
        tail.prev = null;
        return data;
    }


    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.insertFirst(10);
        dll.insertFirst(20);
        dll.insertFirst(30);
        dll.displayForward();
        System.out.println(dll.size());

        dll.insertLast(5);
        dll.displayForward();
        System.out.println(dll.size());

        dll.insert(2, 25);
        dll.displayForward();
        System.out.println(dll.size());

        dll.displayBackward();

        System.out.println();
        dll.displayForward();
        System.out.println("Deleted Node => " + dll.deleteFirst());
        dll.displayForward();
        System.out.println(dll.size());
    }
}
