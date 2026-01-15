class MinStack {
    Stack<Long> s;
    long min;
    public MinStack() {
        s=new Stack<>();
    }
    
    public void push(int val) {
        long x=val;
        if(s.isEmpty()) {
            min=x;
            s.push(x);
            return;
        }
        if(val<min){
            s.push(2*x-min);
            min=x;
           
        }else{
             s.push(x);
        }
    }
    
    public void pop() {
        if(s.isEmpty()) return ;
        long x=s.pop();
        if(x<min){
            min=2*min-x;
        }
    }
    
    public long top() {
        if(s.isEmpty()) return -1;
        long x=s.peek();
        if(min<x) return x;
        return min;
    }
    
    public long getMin() {
        return min;
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