package DoublyLinkedList;

public class DoublyLinkedList {
    Node head;
    Node tail;
    int size = 0;

    // add the node at last
    public void add(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            node.next = null;
            node.prev = head;
        } else {
            node.prev = tail;
            tail.next = node;
        }
        tail = node;
        size ++;
    }

    // add node at a index
    public void add (int data, int index) {
        Node node = new Node(data);
        if (index == 0) {
            addFirst(data);
        }
        else if (index == size - 1) {
            add(data);
        }
        else if (index >= size) {
            throw new IndexOutOfBoundsException("Index does not exists");
        }
        else {
            Node crr = head;
            int i = 1;
            while (i < index - 1) {
//                System.out.println(crr.data);
                crr = crr.next;
                i++;
            }
            node.next = crr.next;
            node.prev = crr;
            crr.next = node;
            size++;
        }
    }
    // add the node at first
    public void addFirst(int data) {
        Node node = new Node(data);
        node.next = head;
        head = node;
        node.prev = head;
        size ++;
    }

    // delete a node from last
    public int delete() {
        int data = 0;
        if (head == null)
            throw new IndexOutOfBoundsException("Linked List is Empty!!");
        else {
            data = tail.data;
            tail.prev.next = null;
            tail = tail.next;
            size --;
        }
        return data;
    }

    // delete a node from start
    public int deleteFirst() {
        int data = 0;
        if (head == null)
            throw new ArrayIndexOutOfBoundsException("Linked List is Empty!!");
        else {
            data = head.data;
            head = head.next;
            head.prev = head;
            size --;
        }
        return data;
    }

    // display the list
    public void display() {
        Node n = head;
        while (n != null) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println("null");
    }

    // delete a node at any index
    public int delete(int index) {
        int i = 0, data = 0;
        Node crr = head;
        while (i ++ < index - 1) {
            crr = crr.next;
        }
        data = crr.next.data;
        crr.next = crr.next.next;
        crr.next.prev = crr;
        size --;
        return data;
    }

    public static void main(String[] args) {
        DoublyLinkedList dll = new DoublyLinkedList();
        dll.add(10);
        dll.add(20);
        dll.add(30);
        dll.display();

        dll.addFirst(6);
        dll.display();

        dll.addFirst(5);
        dll.display();

        dll.add(25, 2);
        dll.display();

        System.out.println("Last Deleted Node => " + dll.delete());
        dll.display();

        System.out.println("First Deleted Node => " + dll.deleteFirst());
        dll.display();

        System.out.println("Deleted Node => " + dll.delete(2));
        dll.display();
    }
}
