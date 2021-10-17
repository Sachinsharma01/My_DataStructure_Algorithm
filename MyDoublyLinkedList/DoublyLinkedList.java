package MyDoublyLinkedList;

interface DoublyLinkedListADT<E> {
    boolean add(E item);
    E remove();
    E remove(int index);
    void show();
    E get(int index);
}
class DoublyLinkedList<E> implements DoublyLinkedListADT<E> {
    private Node<E> head;
    private int size;
    private Node<E> tail;
    @Override
    public boolean add(E item) {
        Node<E> n = head;
        Node<E> node = new Node(item);
        if (head == null) {
            head = node;
            node.previous = node;
            size++;
            return true;
        }
        else {
            while(n.next != null) {
                n = n.next;
            }
            node.previous = n;
            n.next = node;
            tail = node;
            size++;
        }
        return false;
    }

    @Override
    public E remove() {
        Node<E> n = tail;
        tail = tail.previous;
        E value = tail.data;
        tail.previous.next = tail;
        return value;
    }

    @Override
    public E remove(int index) {
        return null;
    }

    @Override
    public void show() {
        Node<E> n = tail;
        for (int i = 0; i < size - 1; i++) {
            System.out.println(n.data);
            n = n.previous;
        }
    }

    @Override
    public E get(int index) {
        Node<E> n = head;
        for (int i = 0; i < index - 1; i++) {
            n = n.next;
        }
        return n.data;
    }

    public static void main(String[] args) {
        DoublyLinkedList<Integer> ddl = new DoublyLinkedList<>();
        ddl.add(10);
        ddl.add(20);
        ddl.add(30);
        ddl.add(40);
        System.out.println();
        ddl.show();
        System.out.println();
        ddl.remove();
        ddl.show();
    }
}

