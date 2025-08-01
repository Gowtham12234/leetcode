class MyCircularQueue {
    int[] arr;
    int capacity,size,front,rear;

    public MyCircularQueue(int k) {
        capacity=k;
        arr=new int[k];
        front=-1;
        rear=-1;
        size=0;
    }
    
    public boolean enQueue(int value) {
        if(isFull()){
            
            return false;
        }
        if(isEmpty()){
            front=0;

        }
        rear=(rear+1)%capacity;
        arr[rear]=value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(isEmpty()) return false;
        int removed=arr[front];
        if(front==rear){
            front=rear=-1;
        }else{
            front=(front+1)%capacity;
        }
        size--;
        return true;
        
    }
    
    public int Front() {
        if (isEmpty()) return -1;
        return arr[front];
    }
    
    public int Rear() {
        if (isEmpty()) return -1;
        return arr[rear];
    }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==capacity;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */