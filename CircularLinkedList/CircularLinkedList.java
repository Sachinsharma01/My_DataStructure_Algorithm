package CircularLinkedList;


public class CircularLinkedList {
    public Node head;
    public Node tail;
    public int size = 0;

    public void addLast(int data) {
        Node node = new Node(data);
        if (head == null) {
            head = node;
            tail = node;
            node.next = node;
        } else {
            tail.next = node;
            node.next = head;
            tail = node;
        }
        size ++;
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
    }
}
