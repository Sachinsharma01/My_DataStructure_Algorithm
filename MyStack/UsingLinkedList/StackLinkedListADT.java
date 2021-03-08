package MyStack.UsingLinkedList;

import java.util.NoSuchElementException;

public interface StackLinkedListADT<E> {
    void push(E item) throws StackOverflowError;
    E pop() throws NoSuchElementException;
    E peek() throws NoSuchElementException;
    void show();
    int size();
}
