package PraticeQues;

import java.util.Scanner;

//Fibonacci Series using Recursion
// nCr = n!/(n-r) ! * r!
//class fibonacci
//{
//    static int fib(int n) // n = 9
//    {
//        if (n <= 1)
//            return n;
//        return fib(n-1) + fib(n-2);
//    }
//
//    public static void main (String args[])
//    {
//        int n = 9;
//        System.out.println(fib(n));
//    }
//}
class StackArray {
    private int top = -1;
    private int size;
    private int maxSize;
    private int[] stack;

    public StackArray(int maxSize) {
        this.maxSize = maxSize;
        this.stack = new int[maxSize];
    }
    public void push(int item) {
        if (top == maxSize) {
            System.out.println("Stack OverFlow!");
        } else {
            top++;
            stack[top] = item;
            size++;
        }
    }
    int pop() {
        if (top == -1) {
            System.out.println("Stack UnderFlow!");
        } else {
            size--;
            return stack[top--];
        }
        return -1;
    }
    void print() {
        for (int i = 0; i < top; i++) {
            System.out.println(stack[i]);
        }
    }
}
class MainE {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size : ");
        int size = sc.nextInt();
        StackArray sachin = new StackArray(size);
        sachin.push(10);
        sachin.push(20);
        System.out.println(sachin.pop());
        sachin.push(10);
        sachin.push(20);
        System.out.println(sachin.pop());
        System.out.println(sachin.pop());
        System.out.println(sachin.pop());
        sachin.push(10);
        System.out.println(sachin.pop());
    }
}