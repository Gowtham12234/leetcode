class KthLargest {
    PriorityQueue<Integer> h;
    int k;
    public KthLargest(int k, int[] nums) {
        this.k=k;
        h= new PriorityQueue<>();
        for(int num:nums){
            add(num);
        }
    }
    
    public int add(int val) {
        h.offer(val);
        if(h.size()>k){
            h.poll();
        }
        return h.peek();
    }
}

/**
 * Your KthLargest object will be instantiated and called as such:
 * KthLargest obj = new KthLargest(k, nums);
 * int param_1 = obj.add(val);
 */