package Leetcode;

import java.util.LinkedList;
import java.util.Queue;

public class Leetcode_225 {
    Queue<Integer> q1;
    Queue<Integer> q2;
    Leetcode_225() {
        this.q1 = new LinkedList<>();
        this.q2 = new LinkedList<>();
    }

    public void push(int x) {
        q1.add(x);
        while (!q1.isEmpty())
            q2.add(q1.remove());
        while (!q2.isEmpty())
            q1.add(q2.remove());
    }

    public int pop() {
        if (q1.isEmpty())
            return -1;
        while (!q1.isEmpty())
            q2.add(q1.remove());
        int res = q2.remove();
        while (!q2.isEmpty())
            q1.add(q2.remove());
        return res;
    }

    public int top() {
        if (q1.isEmpty())
            return -1;
        while (!q1.isEmpty())
            q2.add(q1.remove());
        int res = q2.peek();
        while (!q2.isEmpty())
            q1.add(q2.remove());
        return res;
    }

    public boolean empty() {
        return q1.isEmpty();
    }
}
