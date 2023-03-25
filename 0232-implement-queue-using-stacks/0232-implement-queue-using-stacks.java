class MyQueue {
    Deque<Integer> s1 = new ArrayDeque<>();
    Deque<Integer> s2 = new ArrayDeque<>();

    public MyQueue() {
        s1 = new ArrayDeque<>();
        s2 = new ArrayDeque<>();
    }
    
    public void push(int x) {
        while(s1.peek()!=null)
            s2.push(s1.poll());
        s1.push(x);
        while(s2.peek()!=null)
            s1.push(s2.poll());
    }
    
    public int pop() {
        return s1.poll();
    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean empty() {
        if(s1.peek()!=null)
            return false;
        return true;
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */