//Stack implementation using 2 queues

class MyStack {

    Queue<Integer> q1 = new LinkedList<>();
    Queue<Integer> q2 = new LinkedList<>();

    public void push(int x) {
            q1.add(x);
    }
    
    public int pop() {
        int top = -1;
        if(q1.isEmpty()) return -1;
        while(q1.size() > 1){
            q2.add(q1.remove());
        }
        top = q1.remove();
        Queue <Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return top;
    }
    
    public int top() {
        if (q1.isEmpty()) return -1;

        while (q1.size() > 1) {
        q2.add(q1.remove());
        }

    int top = q1.peek(); // don't remove
    q2.add(q1.remove()); // move it also

    // swap back
        Queue<Integer> temp = q1;
        q1 = q2;
        q2 = temp;
        return top;
    }
    
    public boolean empty() {
        return q1.isEmpty();
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
