class MinStack {
    Stack<Integer> mainstack=new Stack<>();
    Stack<Integer> minstack=new Stack<>();

    public MinStack() {
        minstack=new Stack<>();
        mainstack=new Stack<>();
    }
    
    public void push(int val) {
        mainstack.push(val);
        if(minstack.isEmpty() || val<=minstack.peek()){
            minstack.push(val);
        }
        else{
            minstack.push(minstack.peek());
        }
    }

    
    public void pop() {
        if(!mainstack.isEmpty()){
            mainstack.pop();
            minstack.pop();
        }    
    }
    
    public int top() {
        return mainstack.peek();
        
    }
    
    public int getMin() {
        return minstack.peek();
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