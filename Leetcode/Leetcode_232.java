package Leetcode;

import java.util.Stack;

public class Leetcode_232 {
    int peek;
    Stack<Integer> s1;
    Stack<Integer> s2;
//    public Leetcode_232() {
//        this.s1 = new Stack<>();
//        this.s2 = new Stack<>();
//    }
//
//    public void push(int x) {
//        s1.push(x);
//    }
//
//    public int pop() {
//        if (empty())
//            return -1;
//        while (!s1.isEmpty()) {
//            s2.push(s1.pop());
//        }
//        peek = s2.peek();
//        int data = s2.pop();
//        while (!s2.isEmpty())
//            s1.push(s2.pop());
//        return data;
//    }
//
//    public int peek() {
//        if (s1.isEmpty())
//            return -1;
//        return peek;
//    }
//
//    public boolean empty() {
//        return s1.isEmpty();
//    }
    Leetcode_232() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }

    public void push(int x) {
        if(empty()) {
            s1.push(x);
        }else {
            while(s1.size()>0) {
                s2.push(s1.pop());
            }
            s1.push(x);
            while(s2.size()>0) {
                s1.push(s2.pop());
            }
        }

    }

    public int pop() {
        if(empty())
            return -1;
        return s1.pop();
    }

    public int peek() {
        if(empty())
            return -1;
        return s1.peek();
    }

    public boolean empty() {
        return s1.isEmpty();
    }

    public static void main(String[] args) {
        Leetcode_232 l = new Leetcode_232();
        l.push(10);
        l.push(20);
        l.push(30);
        l.push(40);
        System.out.println(l.empty());
        System.out.println(l.peek());
        System.out.println(l.pop());
    }
}
