package MyQueue.UsingLinkedList;

import MyQueue.QueueADT;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class QueueUsingLinkedList<E> implements QueueADT<E> {
    private LinkedList<E> queue;
    private int MAX_SIZE;
    private int size;

    public QueueUsingLinkedList(int MAX_SIZE) {
        this.queue = new LinkedList<>();
        this.MAX_SIZE = MAX_SIZE;
    }

    @Override
    public void enqueue(E item) throws NoSuchElementException {
        if (size == MAX_SIZE)
            throw new NoSuchElementException("Queue is Full!");
        else {
            queue.addLast(item);
            size++;
        }
    }

    @Override
    public E dequeue() throws NoSuchElementException {
        if (size == 0)
            throw new NoSuchElementException("Queue is Empty!");
        else {
            size--;
            return queue.removeFirst();
        }
    }

    @Override
    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println(queue.get(i));
        }
    }

    @Override
    public int size() {
        return size;
    }
}
