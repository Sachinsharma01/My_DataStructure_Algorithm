package MyQueue.UsingArray;

import MyQueue.QueueADT;

import java.util.NoSuchElementException;

public class QueueArray<E> implements QueueADT<E> {
    private Object[] queue;
    private int MAX_SIZE;
    private int front;
    private int rear;
    private int size;

    public QueueArray(int MAX_SIZE) {
        this.queue = new Object[MAX_SIZE];
        this.MAX_SIZE = MAX_SIZE;
        this.front = -1;
        this.rear = -1;
    }

    @Override
    public void enqueue(E item) throws NoSuchElementException {
        if (rear == MAX_SIZE)
            throw new NoSuchElementException("Queue if Full!");
        else {
            queue[++rear] = item;
            size++;
        }
    }

    @Override
    public E dequeue() throws NoSuchElementException {
        if (front == rear)
            throw new NoSuchElementException("Queue is Empty!");
        else {
            size--;
            return (E) queue[++front];
        }
    }

    @Override
    public void show() {
        for (int i = front + 1; i <= rear; i++) {
            System.out.println(queue[i]);
        }
    }

    @Override
    public int size() {
        return size;
    }
}
