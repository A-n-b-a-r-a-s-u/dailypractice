package dailypractice.LeetCode.july.week1;

import java.util.LinkedList;
import java.util.Queue;

public class stackUsingQueue {
    Queue<Integer> queue;
    public stackUsingQueue() {
        queue = new LinkedList<>();
    }

    public void push(int x) {
        queue.add(x);
        int size = queue.size();
        for (int i = 0; i< size-1; i++){
            queue.add(queue.remove());
        }
    }

    public int pop() {
        return queue.poll();
    }

    public int top() {
        return queue.peek();
    }

    public boolean empty() {
        return queue.isEmpty();
    }
}
