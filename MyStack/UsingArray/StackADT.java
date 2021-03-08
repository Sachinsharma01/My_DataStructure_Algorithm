package MyStack.UsingArray;

import java.util.NoSuchElementException;

interface StackADT<E> {
    void push(E item) throws StackOverflowError;
    E pop() throws NoSuchElementException;
    E peek() throws NoSuchElementException;
    int size();
    void show();
}