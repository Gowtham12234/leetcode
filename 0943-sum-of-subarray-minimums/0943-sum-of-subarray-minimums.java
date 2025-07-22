class Solution {
    public int sumSubarrayMins(int[] arr) {
       int mod = (int)1e9 + 7;
       int n=arr.length;
        int[] ple=new int[n];
        int[] nle=new int[n];
        Stack<Integer>stack=new Stack<>();
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && arr[i]<arr[stack.peek()]){
                stack.pop();
            }
            ple[i]=stack.isEmpty()? -1:stack.peek();
            stack.push(i);
        }
        stack.clear();

        for(int i=n-1;i>=0;i--){
            while(!stack.isEmpty() && arr[i]<=arr[stack.peek()]){
                stack.pop();
            }
            nle[i]=stack.isEmpty()?n:stack.peek();
            stack.push(i);
        }
         long sum = 0;
        for (int i = 0; i < n; i++) {
            int leftCount = i - ple[i];
            int rightCount = nle[i] - i;
            long contrib = (long) arr[i] * leftCount * rightCount;
            sum = (sum + contrib) % mod;
        }

        return (int) sum;
    
     }
}