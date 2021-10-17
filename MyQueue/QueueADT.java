package MyQueue;

public interface QueueADT<E> {
    void enqueue(E item);
    E dequeue();
    void show();
    int size();
}
