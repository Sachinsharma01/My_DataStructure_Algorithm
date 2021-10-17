package CircularLinkedList;


public class CircularLinkedList {
    public Node head;
    public Node tail;
    public int size = 0;

    // insert at Last
    public void addLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            node.next = head;
        } else {
            tail.next = node;
            node.next = head;
            tail = node;
        }
        size ++;
    }

    // add first
    public void addFirst(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
        }
        node.next = head;
        head = node;
        size ++;
    }

    // insert at any
    public void add(int data, int index) {
        if (index == 0)
            addFirst(data);
        else if (index >= size - 1)
            addLast(data);
        else {
            Node node = new Node(data);
            Node crr = head;
            int i = 1;
            while (i++ < index - 1) {
                crr = crr.next;
            }
            node.next = crr.next;
            crr.next = node;
            size ++;
        }
    }

    // delete Last node
    public int deleteLast() {
        int data = tail.data;
        Node n = head;
        while (n.next.data != tail.data) {
            n = n.next;
        }
        size --;
        n.next = head;
        tail = n;
        return data;
    }

    //delete First
    public int deleteFirst() {
        int data = head.data;
        head = head.next;
        tail.next = head;
        size --;
        return data;
    }

    // delete at any
    public int delete(int index) {
        Node crr = head;
        if (index == 0)
            deleteFirst();
        if (index == size - 1)
            deleteLast();
        int i = 1;
        while (i++ < index)
            crr = crr.next;
        int data = crr.next.data;
        crr.next = crr.next.next;
        size --;
        return data;
    }

    // middle of the linked list
    public int middle() {
        Node slow = head, fast = head;
        while (slow != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow.data;
    }

    //display the CircularLinkedList
    public void display() {
        Node n = head;
        for (int i = 0; i < size; i++) {
            System.out.print(n.data + " -> ");
            n = n.next;
        }
        System.out.println("null");
    }

    public static void main(String[] args) {
        CircularLinkedList cll = new CircularLinkedList();
        cll.addLast(10);
        cll.addLast(20);
        cll.addLast(30);
        cll.addLast(40);
        cll.addLast(50);
        cll.display();
        System.out.println(cll.size);

        cll.addFirst(1);
        cll.display();
        System.out.println(cll.size);

        cll.add(15, 3);
        cll.display();
        System.out.println(cll.size);

        System.out.println("Last Deleted Node => " + cll.deleteLast());
        cll.display();
        System.out.println(cll.size);

        System.out.println("First Deleted Node => " + cll.deleteFirst());
        cll.display();
        System.out.println(cll.size);

        System.out.println("Deleted Node => " + cll.delete(2));
        cll.display();
        System.out.println(cll.size);

        System.out.println(cll.middle());
    }
}
