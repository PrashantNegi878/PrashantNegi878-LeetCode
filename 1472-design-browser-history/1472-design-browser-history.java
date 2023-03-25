class BrowserHistory {
    Deque<String> history = new ArrayDeque<>();
    Deque<String> future = new ArrayDeque<>();
    public BrowserHistory(String homepage) {
        history.add(homepage);
        future.clear();
    }
    
    public void visit(String url) {
        history.push(url);
        future.clear();
    }
    
    public String back(int steps) {
        while (steps > 0 && history.size() > 1) {
            future.push(history.poll());
            steps--;
        }
        return history.peek();
    }
    
    public String forward(int steps) {
        while (steps > 0 && future.size() > 0) {
            history.push(future.poll());
            steps--;
        }
        return history.peek();
    }
}

/**
 * Your BrowserHistory object will be instantiated and called as such:
 * BrowserHistory obj = new BrowserHistory(homepage);
 * obj.visit(url);
 * String param_2 = obj.back(steps);
 * String param_3 = obj.forward(steps);
 */