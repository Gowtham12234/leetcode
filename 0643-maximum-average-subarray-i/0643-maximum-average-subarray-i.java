class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int windowavg=0;
        for(int i=0;i<k;i++){
            windowavg+=nums[i];
        }
        int maxavg=windowavg;
        for(int i=k;i<nums.length;i++){
            windowavg=windowavg-nums[i-k]+nums[i];
            maxavg=Math.max(maxavg,windowavg);
        }
        return (double)maxavg/k;
        
    }
}