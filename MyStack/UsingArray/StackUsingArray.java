package MyStack.UsingArray;

import java.util.NoSuchElementException;

class StackUsingArray<E> implements StackADT<E> {
    private Object[] stack;
    private int MAX_SIZE;
    private int top = -1;
    private int size;

    public StackUsingArray(int MAX_SIZE) {
        stack = new Object[MAX_SIZE];
        this.MAX_SIZE = MAX_SIZE;
    }

    @Override
    public void push(E item)throws StackOverflowError {
        if (top == MAX_SIZE)
            throw new StackOverflowError("Stack OverFlow");
        else {
            stack[++top] = item;
        }
        size++;
    }

    @Override
    public E pop() throws NoSuchElementException {
        if (top < 0) {
            throw new NoSuchElementException("Stack UnderFlow");
        } else {
            size--;
            return (E) stack[top--];
        }
    }

    @Override
    public E peek() {
        if (top < 0) {
            throw new NoSuchElementException("Stack UnderFlow");
        } else {
            return (E) stack[top];
        }
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println("|" + stack[i] + "|" + "\n____");
        }
    }
}

