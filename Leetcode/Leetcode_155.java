package Leetcode;

import java.util.Stack;
// Leetcode 155
class MinStack {
    Stack<Integer> s;
    public MinStack() {
        s = new Stack<>();
    }

    public void push(int val) {
        s.push(val);
    }

    public void pop() {
        s.pop();
    }

    public int top() {
        return s.peek();
    }

    public int getMin() {
        Stack<Integer> s2 = new Stack<>();
        int min = Integer.MAX_VALUE;
        while (!s.isEmpty()) {
            int a = s.pop();
            min = Integer.min(a, min);
            s2.push(a);
        }
        while (!s2.isEmpty()) {
            int a = s2.pop();
            s.push(a);
        }

        return min;
    }
}
