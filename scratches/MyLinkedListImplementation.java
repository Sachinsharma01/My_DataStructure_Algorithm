interface MyLinkedListInterface <E> {
    void add(E item, int index);
    int search(E item);
    void sort();
    E remove();
    void print();
}

class MyLinkedList<E> implements MyLinkedListInterface<E> {

    private Node<E> head = null;
    private int size = 0;

    private void addFirst(E item) {
        Node<E> node = new Node<>(item);
        size++;
    }
    private static Node<E> getNode() {
        return
    }

    @Override
    public void add(E item, int index) {
        if (index > size || index < 0) {
            throw new IndexOutOfBoundsException("Index Out Of Bound");
        }
        else if (index == 0) {
            addFirst(item);
        }
        else {
            Node<E> node = new Node<>(item, index);
        }
    }

    private static class Node<E> {
        private E data;
        private Node<E> next;

        public Node(E data) {
            this.data = data;
        }

        private Node(E data, Node<E> next) {
            this.data = data;
            this.next = next;
        }

        public E getData() {
            return data;
        }

        public Node<E> getNext() {
            return next;
        }
    }
}