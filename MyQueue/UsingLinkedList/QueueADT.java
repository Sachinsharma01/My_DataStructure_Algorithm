package MyQueue.UsingLinkedList;

public interface QueueADT<E> {
    void enqueue(E item);
    E dequeue();
    void show();
    int size();
}
