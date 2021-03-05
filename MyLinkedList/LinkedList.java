package MyLinkedList;

public class LinkedList {
    Node head;
    public static int size = 0;

    public void insert(int data) {
         Node node = new Node();
         node.data = data;
         if (head == null) {
             head = node;
             size++;
         }
         else {
             Node n = head;
             while (n.next != null) {
                 n = n.next;
                 size++;
             }
             n.next = node;
         }
        node.next = null;
    }
    public void print() {
        Node n = head;
        while (n.next != null) {
            System.out.println(n.data);
            n = n.next;
        }
        System.out.println(n.data);
    }
    public int remove() throws IndexOutOfBoundsException {
        Node n = head;
        if (head == null)
            throw new IndexOutOfBoundsException("LinkedList is Empty");
        for (int i = 0; i < size - 1; i++) {
            n = n.next;
        }
        int data = n.data;
        n.next = null;
        return data;
    }
}
