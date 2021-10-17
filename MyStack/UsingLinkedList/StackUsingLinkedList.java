package MyStack.UsingLinkedList;

import java.util.LinkedList;
import java.util.NoSuchElementException;

public class StackUsingLinkedList<E> implements StackLinkedListADT<E> {
    private LinkedList<E> stack;
    private int MAX_SIZE;
    private int size;

    public StackUsingLinkedList(int MAX_SIZE) {
        this.MAX_SIZE = MAX_SIZE;
        stack = new LinkedList<>();
    }

    @Override
    public void push(E item) throws StackOverflowError {
        if (size == MAX_SIZE)
            throw new StackOverflowError("Stack OverFlow");
        else {
            stack.addLast(item);
            size++;
        }
    }

    @Override
    public E pop() {
        if (size == 0)
            throw new NoSuchElementException("Stack UnderFlow");
        else {
            size--;
            return stack.removeLast();
        }
    }

    @Override
    public E peek() {
        if (size == 0)
            throw new NoSuchElementException("Stack UnderFlow");
        else {
            return stack.peekLast();
        }
    }

    @Override
    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println(stack.get(i));
        }
    }

    @Override
    public int size() {
        return size;
    }
}
