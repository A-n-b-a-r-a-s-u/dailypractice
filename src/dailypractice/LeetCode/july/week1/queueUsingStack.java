package dailypractice.LeetCode.july.week1;

import java.util.Stack;

public class queueUsingStack {
    Stack<Integer> instack;
    Stack<Integer> outstack;
    public queueUsingStack() {
        instack = new Stack<>();
        outstack = new Stack<>();
    }

    public void push(int x) {
        instack.push(x);
    }

    public int pop() {
        peek();
        return outstack.pop();
    }

    public int peek() {
        if (outstack.empty()){
            while (!instack.empty()){
                outstack.push(instack.pop());
            }
        }
        return outstack.peek();
    }

    public boolean empty() {
        return instack.isEmpty() && outstack.isEmpty();
    }

    public static void main(String[] args) {
        queueUsingStack q = new queueUsingStack();
        q.push(1);
        q.push(2);
        q.push(3);
        q.push(4);
        System.out.println(q.pop());
        q.push(5);
        System.out.println(q.pop());
        System.out.println(q.pop());

    }
}
