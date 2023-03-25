class MinStack {

    Deque<Integer> s = new ArrayDeque<>();
    Deque<Integer> ms = new ArrayDeque<>();

    public MinStack() {
        s = new ArrayDeque<>();
        ms = new ArrayDeque<>();
    }
    
    public void push(int val) {
        if(ms.peek()==null || ms.peek()>=val)
            ms.push(val);
        s.push(val);
    }
    
    public void pop() {
        if(ms.peek().equals(s.peek()))
        {  
            ms.poll();
            s.poll();
        }
        else  
            s.poll();
    }
    
    public int top() {
        return s.peek();
    }
    
    public int getMin() {
        return ms.peek();
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */