class Solution {
    public int[] nextGreaterElements(int[] nums) {
        Stack<Integer> st=new Stack<>();
        int[] res=new int[nums.length];
        int n=nums.length;
        for(int i=2*n-1;i>=0;i--){
            int ind=i%n;
            while(!st.isEmpty() && st.peek()<=nums[ind]){
                st.pop();
            }
            if(i<n){
                if(st.isEmpty()){
                    res[ind]=-1;
                }else{
                    res[ind]=st.peek();
                }
            }
            st.push(nums[ind]);
            
        }
        return res;
    }
}