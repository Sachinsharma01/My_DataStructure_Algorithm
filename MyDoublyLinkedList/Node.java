package MyDoublyLinkedList;

public class Node<E> {
    Node<E> next;
    Node<E> previous;
    E data;

    public Node(E data) {
        this.data = data;
    }
}
