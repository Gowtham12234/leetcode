class Solution {
    public boolean canship(int[] weights,int days,int capacity){
        int dayscount=1;
        int currentload=0;
        for(int w:weights){
            if(currentload+w>capacity){
                dayscount++;
                currentload=0;
            }
            currentload+=w;
        }return dayscount<=days;
    }
    public int shipWithinDays(int[] weights, int days) {
        int low=0;
        int high=0;
        for(int w:weights){
            low=Math.max(low,w);
            high+=w;
        }
        while(low<=high){
            int mid=low+(high-low)/2;
            if(canship(weights,days,mid)){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }return low;
    }
}