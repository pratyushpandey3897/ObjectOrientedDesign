import java.util.LinkedList;
import java.util.Queue;

class StackWithQueue {
    // can also be done with one queue, where we insert the
    // element added in the queue then re arrange all the other elemetns
    Queue<Integer> q1;
    Queue<Integer> q2;
    public StackWithQueue() {
        q1 = new LinkedList<> ();
        q2 = new LinkedList<>();
    }

    public void push(int x) {
        while (!q2.isEmpty()){
            q1.add(q2.poll());
        }
        q2.add(x);
        while (!q1.isEmpty())
            q2.add(q1.poll());
    }

    public int pop() {
        return q2.poll();
    }

    public int top() {
        return q2.peek();
    }

    public boolean empty() {
        return q2.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */